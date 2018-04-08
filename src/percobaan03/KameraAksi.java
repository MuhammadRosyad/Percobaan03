package percobaan03;
public class KameraAksi {
    public static void main(String[] args){
        Kamera k = new Kamera();
        
        k.setMerk("Canon");
        k.setMegapixel("20");
        k.setHarga("5000");
        
        k.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(k.getMerk());
        System.out.print("Megapixelnya \t: ");
        System.out.println(k.getMegapixel());
        System.out.print("Harganya \t: ");
        System.out.println(k.getHarga());
    }
}
