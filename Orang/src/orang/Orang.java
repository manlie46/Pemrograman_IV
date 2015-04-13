package orang;


public class Orang {
    private String nama;
    
    public Orang(){
        
    }
    public void setNama (String name){
       nama=name;
        
    }
    public void getNama(){
        System.out.println("Dia bernama :  "+ nama);
    }
    public void cetakinfo(){
        System.out.println("Data Orang");
    }
    
}