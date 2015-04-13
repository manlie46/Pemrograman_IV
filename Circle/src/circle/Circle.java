/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Manlie
 */
public class Circle {

    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "red";
        System.out.println(radius);
        System.out.println(color);
    }
    public Circle(double r){
        radius = r;
        color = "red";
          System.out.println(radius);
        System.out.println(color);
        
    }
    public Circle(double r, String c){
        radius = r;
        color = c;
      System.out.println(radius);
        System.out.println(color);
    }
    
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
        
    }
    
    public static void main(String[] args) {
        Circle gambar=new Circle();
        gambar.getRadius();
        gambar.getColor();
        gambar.getArea();
        
        Circle rds=new Circle(3);
   
        
        Circle rc= new Circle(4,"green");
               
                
    
          }
    
}
