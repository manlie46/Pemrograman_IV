/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

public class Cat extends Animal implements Pet {
    private String name;
    
    public Cat(String nama){
        this.name=nama;
    }
    public Cat(){
        
    }

    @Override
    public String getName(){
        System.out.println(name);
        return name;
    }
    @Override
   public String setName(String nama){
        name=nama;
        return name;
   }
    @Override
    public void play(){
       System.out.println("suka bermain bola");
   }
   
    public void eat(){
       System.out.println("suka makan ikan");
   }

}
