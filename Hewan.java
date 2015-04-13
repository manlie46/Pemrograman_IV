package javalatihan;

public class Hewan {
        int umur;
        int jumlahKaki;
        
        public Hewan(){
            
        }
        public void setUmur(int umurHewan) {
            umur = umurHewan;
           
        }
        public int getUmur(){
            System.out.println("umur hewan " + umur);
            return umur;
        }
        public void setJumlahkaki(int jmlKaki){
            jumlahKaki = jmlKaki;
        }
        public void getJumlahkaki(){
            System.out.println("jumlah kaki " + jumlahKaki);
       
        }
        public void berbunyi(){
            System.out.println("hewan dapat berbunyi");
        }
        public void berjalan(){
            System.out.println("hewan dapat berjalan");
        }
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan kucing = new Hewan();
        kucing.setUmur(3);
        kucing.getUmur();
        kucing.setJumlahkaki(4);
        kucing.getJumlahkaki();
        kucing.berbunyi();
        kucing.berjalan();
        
    }
}
