
package mahasiswa;

public class Mahasiswa {
    private String nama;
   
   public Mahasiswa(){
      
   }
   public Mahasiswa (String namamhs){
       nama = namamhs;
   }
   public void setNama(String namamhs){
       nama = namamhs;
   }
   public String getNama(){
       System.out.println("Nama  : " + nama);
       return nama;
   } 
   public void ongkos(int ongkir){
        int jml = ongkir *2;
        System.out.println(jml);
   } 
   public void ongkos (){
       System.out.println("5000");
       
   }
           
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa udin = new Mahasiswa();
        udin.setNama("Fajar");
        udin.getNama();
        udin.ongkos(1000);
       
        
        Mahasiswa maman = new Mahasiswa ("Rini");
        maman.getNama();
        maman.ongkos();
        

    }
}
