/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orang;


public class MainOrang {

    
    public static void main(String[] args) {
       
        Orang sunda=new Orang();
        sunda.setNama("Harun");
        sunda.getNama();
        sunda.cetakinfo();
        
        Mahasiswa utama=new Mahasiswa();
        utama.setNama("Mahmud");
        utama.getNama();
        utama.cetakinfo();
        
        Dosen wdytma=new Dosen();
        wdytma.setNama("Bahar");
        wdytma.getNama();
        wdytma.cetakinfo();
    }
    
}
