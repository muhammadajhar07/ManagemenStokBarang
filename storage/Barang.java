package storage;


public class Barang {
    private String nama;
    private String kode;
    private int stok;
    
    Barang(String nama, String kode, int stok){
        this.setNama(nama);
        this.setKode(kode);
        this.setStok(stok);
    }
    
    @Override
    public String toString (){
        return String.format("Nama : %-15s | Kode : %-10s | Stok : %-5s", nama, kode, stok);
    }
    
    public String getKode () {
        return kode;
    }
    
    public String getNama () {
        return nama;
    }
    
    public int getStok () {
        return stok;
    }
    
    public void setNama (String nama) {
        this.nama = nama;
    }
    
    public void setKode (String kode) {
        this.kode = kode;
    }
    
    public void setStok (int kode) {
        this.stok = stok;
    }
}
