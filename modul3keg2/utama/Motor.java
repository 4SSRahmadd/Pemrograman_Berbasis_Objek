package utama;

public class Motor {
    private String Tipe;
    protected String BBM;

    public void iniTipe() {
        this.Tipe = "Moge";
        this.BBM = "Pertamax";
        System.out.println("Tipe :" + this.Tipe);
        System.out.println("BBM :" + this.BBM);
    }
    private int CC;
    public void tampilCC() {
        this.CC = 1000;
        System.out.println("CC :" + this.CC);
    }
    private int harga = 15000;
    public void iniHarga() {
        this.BBM = "Pertamax";
        System.out.println("Harga BBM ("+ this.BBM +")  :" + this.harga);
    }
    private int KM = 14;
    public void totalJarak(int harga){ 
        System.out.print("Jarak per KM  :"+ (harga/this.KM));
    }
}
