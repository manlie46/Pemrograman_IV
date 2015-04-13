/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;


public class mainhewan {

    
    public static void main(String[] args) {
        Hewan hwn=new Hewan();
        hwn.makan();
        hwn.tidur();
        
        Kucing kcng=new Kucing();
        kcng.tidur();
        kcng.makan();
        kcng.bermain();
        
        Harimau hrm=new Harimau();
        hrm.tidur();
        hrm.makan();
        
    }
}
