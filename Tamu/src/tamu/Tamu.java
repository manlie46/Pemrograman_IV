/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tamu;


public class Tamu {
    private int id_ruangan;
    private String nama_ruangan;
    private int lama_menginap;
    
    public Tamu(){
        
    }
    public void setIdruangan(int id){
        id_ruangan = id;
    }
    public int getIdruangan(){
        System.out.println("Id ruangan = " + id_ruangan);
        return id_ruangan;
    }
    public void setNamaruangan(String nama){
        nama_ruangan = nama;
    }
    public String getNamaruangan(){
        System.out.println("nama ruangan = " + nama_ruangan);
        return nama_ruangan;
    }
    public void setLama_menginap(int lama){
        lama_menginap = lama;
    }
    public int getLama_menginap(){
        System.out.println("Lama menginap = " + lama_menginap);
        return lama_menginap;
    }
    public void jumlah_biaya(){
        int H = lama_menginap*120000;
        System.out.println("jumlah biaya = " + H);
        
    }
    public void jumlah_biaya(int a){
        int H = lama_menginap*a;
        System.out.println("jumlah biaya = " + H);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Tamu harga=new Tamu();
        harga.setIdruangan(2146);
        harga.getIdruangan();
        harga.setNamaruangan("Besar");
        harga.getNamaruangan();
        harga.setLama_menginap(5);
        harga.getLama_menginap();
        harga.jumlah_biaya();
        
        Tamu harga2=new Tamu();
        harga.jumlah_biaya(360000);
    }
}
