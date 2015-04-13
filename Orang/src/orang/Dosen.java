
package orang;


public class Dosen extends Orang{
    private String nip;
    private double gaji;
    
    public Dosen(){
        super();
        nip="081274UT";
        gaji = 4500000;
        System.out.println("Nip :  "+ nip);
        System.out.println("Gaji :  " +gaji);
    }
    public void cetakinfo(){
        System.out.println("Data Dosen");
    }
}
