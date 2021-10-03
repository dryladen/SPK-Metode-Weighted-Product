package Frame;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Laden
 */
public final class MetodeWP {
    /*
    Bobot tiap kriteria
    Harga = 10
    Bahan = 10
    Keempukan = 10
    Kecocokan Warna = 10
    Lebar = 10
    Fitur = 10
    Garansi = 5
    total w = 65
    */
    double w [] = {5,5,5,5,5,5,1}; // kumpulan bobot kriteria
    double [] wTernormalisasi = new double[7];
    ArrayList<Double> sTernormalisasi;
    ArrayList<BobotPenilaian> dataR = new ArrayList<>();

    public MetodeWP(ArrayList<BobotPenilaian> dataR) {
        this.sTernormalisasi = new ArrayList<>();
        this.dataR.addAll(dataR);
        normalisasiW();
        normalisasiS();
    }
    
    void normalisasiW(){
        for(int i = 0; i < 7; i++){
            this.wTernormalisasi[i] = w[i]/31;
            if(i != 0){
                this.wTernormalisasi[i] = this.wTernormalisasi[i]*1;
            } else {
                this.wTernormalisasi[i] = this.wTernormalisasi[i]*-1;
            }
        }
    }
    
    void normalisasiS(){
        for(int i = 0; i < this.dataR.size(); i++){
            this.sTernormalisasi.add(
                (Math.pow(this.dataR.get(i).getHarga(),wTernormalisasi[0]))* 
                (Math.pow(this.dataR.get(i).getBahan(), wTernormalisasi[1]))*
                (Math.pow(this.dataR.get(i).getKeempukan(), wTernormalisasi[2]))*
                (Math.pow(this.dataR.get(i).getWarna(), wTernormalisasi[3]))*
                (Math.pow(this.dataR.get(i).getLebar(), wTernormalisasi[4]))*
                (Math.pow(this.dataR.get(i).getFitur(), wTernormalisasi[5]))*
                (Math.pow(this.dataR.get(i).getGaransi(), wTernormalisasi[6])));
        }
    }
    
    ArrayList<BobotPenilaian> cariNilaiV(){
        double sumV = 0;
        for(int i = 0; i < sTernormalisasi.size(); i-=-1){
            sumV = sumV + sTernormalisasi.get(i);
        }
        for(int i = 0; i < sTernormalisasi.size(); i-=-1){
            dataR.get(i).setNilaiV(sTernormalisasi.get(i)/sumV);
        }
        for (int i = 0; i < dataR.size() - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < dataR.size(); j++){  
                if (dataR.get(j).getNilaiV() > dataR.get(index).getNilaiV()){  
                    index = j; 
                }  
            }  
            ArrayList<BobotPenilaian> smallerNumber = new ArrayList<>();
            smallerNumber.add(dataR.get(index));
            dataR.set(index, dataR.get(i));
            dataR.set(i, smallerNumber.get(0));
        } 
        return dataR;
    }
}
