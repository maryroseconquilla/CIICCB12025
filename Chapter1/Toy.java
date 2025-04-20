package Chapter1;
public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

public static void main(String[] args) {
    Toy toy1 = new Toy();
    toy1.name="Labubu";
    toy1.brand="Brand1";
    toy1.price=1500;
    toy1.quantity = 5;

    toy1.price=1800;
    System.out.println(toy1.price);
}
}
