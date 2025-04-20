package Chapter1;
public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

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

    toy1.price=1800;
    toy2.price=1500;
    System.out.println(toy1.price);
    System.out.println(toy2.price);
}
}
