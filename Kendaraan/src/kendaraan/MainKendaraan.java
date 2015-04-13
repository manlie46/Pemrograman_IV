
package kendaraan;


public class MainKendaraan {

    
    public static void main(String[] args) {
       Kendaraan kndr=new Kendaraan();
       kndr.bergerak();
       kndr.mengerem();
       
       Mobil mbl=new Mobil();
       mbl.bergerak();
       mbl.mengerem();
       mbl.berjalanMundur();
       
       Pesawat pswt=new Pesawat();
       pswt.mengerem();
       pswt.terbang();
    }
}
