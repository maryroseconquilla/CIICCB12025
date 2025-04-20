package Chapter1;

/**
 * Toy object
 * has a properties of name,brand,price,quantity
 * with a Toy.setPrice method
 * through it invokes {@link #setPrice(double)}
 *  {@link #setPrice()}
 * 
 * @param price The {@code double} to be printed.
 * 
 */

public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price){
    this.price=price;

    }

/**
 * @param args
 */
public static void main(String[] args) {
    Toy toy1 = new Toy();
    Toy toy2 = new Toy();
    toy1.name="Labubu";
    toy1.brand="Brand1";
    toy1.price=1500;
    toy1.quantity = 5;

    
    toy2.name="Car";
    toy2.brand="ToyoCar";
    toy2.price=1000;
    toy2.quantity = 8;

    //toy1.price=1800;
    toy1.setPrice(1500);
    System.out.println(toy1.price);
    System.out.println(toy2.price); 
    }
    

}
class fish{

}
class color{
public static void main(String[] args) {
    Toy toy3 = new Toy();
    fish f1 = new fish();
    System.out.println("Red");
    }
}