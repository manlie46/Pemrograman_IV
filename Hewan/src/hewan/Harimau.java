/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

public class Harimau extends Hewan {
    
    public Harimau(){
        super ();
      
        System.out.println("");
    }
 
    @Override
    public void tidur(){
        System.out.println("harimau tidur terus");
    }
   
    @Override
    public void makan(){
        System.out.println("harimau makan daging celeng");
    }
  
    
}
