
package Animal;

public class Animal {
    protected int legs;
    
    public Animal(){
        
    }
    protected Animal(int legs){
        this.legs = legs;
        System.out.println("berkaki "+legs);
    }
   public void walk(){
       System.out.println("bisa berjalan");
   }
    public void eat(){
       System.out.println("suka makan");
   }
    
}
