package child;

import utama.Motor;

public class Jarak extends Motor {
    private int KM = 14;
    public void totalJarak(int harga){ 
        System.out.print("Jarak per KM  :"+ (harga/this.KM));
    }
}
