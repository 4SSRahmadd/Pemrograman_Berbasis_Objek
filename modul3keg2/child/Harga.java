package child;

import utama.Motor;

public class Harga extends Motor {
    private int harga = 15000;
    public void iniHarga() {
        super.BBM = "Pertamax";
        System.out.println("Harga BBM ("+ super.BBM +")  :" + this.harga);
    }
}
