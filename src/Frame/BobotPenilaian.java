
package Frame;

/**
 *
 * @author Laden
 */
public class BobotPenilaian {
   private int harga,bahan,keempukan,warna,lebar,fitur,garansi;
   private double nilaiV;
   private String nama;

    public BobotPenilaian(String nama,int harga ,int bahan, int keempukan, int warna, int lebar, int fitur, int garansi) {
        this.nama = nama;
        this.harga = harga;
        this.bahan = bahan;
        this.keempukan = keempukan;
        this.warna = warna;
        this.lebar = lebar;
        this.fitur = fitur;
        this.garansi = garansi;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public double getNilaiV() {
        return nilaiV;
    }

    public void setNilaiV(double nilaiV) {
        this.nilaiV = nilaiV;
    }


    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBahan() {
        return bahan;
    }

    public void setBahan(int bahan) {
        this.bahan = bahan;
    }

    public int getKeempukan() {
        return keempukan;
    }

    public void setKeempukan(int keempukan) {
        this.keempukan = keempukan;
    }

    public int getWarna() {
        return warna;
    }

    public void setWarna(int warna) {
        this.warna = warna;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getFitur() {
        return fitur;
    }

    public void setFitur(int fitur) {
        this.fitur = fitur;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
}
