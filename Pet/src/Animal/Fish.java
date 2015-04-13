
package Animal;


public class Fish extends Animal implements Pet {
    String name;

    public Fish() {
        System.out.println("Ikan");
    }
    
    @Override
    public String getName(){
        System.out.println("Namanya :  "+name);
        return name;
    }
    @Override
   public String setName(String nama){
       name = nama;
        return name;
   }
    @Override
    public void play(){
       System.out.println("suka bermain air");
   }
    public void walk(){
       System.out.println("berjalan dalam air");
   }
    public void eat(){
       System.out.println("makan pelet");
   }
}



    


