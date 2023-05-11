package child;

import utama.Motor;

public class R1 extends Motor {
    
    private int CC = 1000;
    public void tampilCC(int CC) {
        System.out.println("CC :" + this.CC);
    }
}