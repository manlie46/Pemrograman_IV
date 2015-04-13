
package Animal;

public class MainAnimal {

    public static void main(String[] args) {
        Animal a = new Animal(4);
        a.walk();
        a.eat();
        
        Spider s = new Spider();
        s.eat();
        
        Fish f = new Fish();
        f.setName("Arwana");
        f.getName();
        f.play();
        f.walk();
        f.eat();
        
        Cat c = new Cat();
        c.setName("Kucing");
        c.getName();
        c.play();
        c.eat();
    }
    
}
