/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orang;

public class Mahasiswa extends Orang {
    private String nim;
    
    public Mahasiswa() {
    super();
        nim = "061172UB";
        System.out.println("nim : "+nim);
    
}
    public void cetakinfo(){
        System.out.println("Data Mahasiswa");
    }
}
