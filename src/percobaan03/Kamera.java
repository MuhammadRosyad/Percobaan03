package percobaan03;
public class Kamera {
    private String Merk;
    private String Megapixel;
    private String Harga;
    
    void cetakInfo(){
        System.out.println("Merk \t: "+Merk+"\n"+
                "Megapixel \t: "+Megapixel+"\n"+
                "Harga \t:"+Harga);
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getMegapixel() {
        return Megapixel;
    }

    public void setMegapixel(String Megapixel) {
        this.Megapixel = Megapixel;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }
    
    
    
}
