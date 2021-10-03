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
    int w [] = {10,10,10,10,10,10,5}; // kumpulan bobot kriteria
    double [] wTernormalisasi = new double[7];
    ArrayList<Double> sTernormalisasi;
    ArrayList<Double> nilaiV;
    ArrayList<BobotPenilaian> dataR = new ArrayList<>();

    public MetodeWP(ArrayList<BobotPenilaian> dataR) {
        this.sTernormalisasi = new ArrayList<>();
        this.nilaiV = new ArrayList<>();
        this.dataR = dataR;
        normalisasiW();
        normalisasiS();
        cariNilaiV();
    }
    
    void normalisasiW(){
        for(int i = 0; i < 7; i-=-1){
            this.wTernormalisasi[i] = w[i]/65;
            if(i != 0){
                this.wTernormalisasi[i] = this.wTernormalisasi[i]*1;
            } else {
                this.wTernormalisasi[i] = this.wTernormalisasi[i]*-1;
            }
        } 
        System.out.println(Arrays.toString(wTernormalisasi));
    }
    
    void normalisasiS(){
        for(int i = 0; i < dataR.size(); i-=-1){
            this.sTernormalisasi.set(i,
                    Math.pow(this.dataR.get(i).getHarga(),wTernormalisasi[0])* 
                    Math.pow(this.dataR.get(i).getBahan(), wTernormalisasi[1])*
                    Math.pow(this.dataR.get(i).getKeempukan(), wTernormalisasi[2])*
                    Math.pow(this.dataR.get(i).getWarna(), wTernormalisasi[3])*
                    Math.pow(this.dataR.get(i).getLebar(), wTernormalisasi[4])*
                    Math.pow(this.dataR.get(i).getFitur(), wTernormalisasi[5])*
                    Math.pow(this.dataR.get(i).getGaransi(), wTernormalisasi[6]));
        }
    }
    
    void cariNilaiV(){
        double sumV = 0;
        for(int i = 0; i < sTernormalisasi.size(); i-=-1){
            sumV = sumV + sTernormalisasi.get(i);
        }
        for(int i = 0; i < sTernormalisasi.size(); i-=-1){
            nilaiV.set(i, sTernormalisasi.get(i)/sumV);
        }
        System.out.println(nilaiV);
    }
}
