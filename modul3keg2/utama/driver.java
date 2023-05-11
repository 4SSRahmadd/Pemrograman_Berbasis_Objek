package utama;

import child.Harga;
import child.Jarak;
import child.R1;

public class driver {
    public static void main(String[] args) {
        Motor ok = new Motor();
        ok.iniTipe();   
        R1 r1 = new R1();
        r1.tampilCC(1000);
        Harga ya = new Harga();
        ya.iniHarga();
        Jarak km = new Jarak();
        km.totalJarak(15000);

    }
}
