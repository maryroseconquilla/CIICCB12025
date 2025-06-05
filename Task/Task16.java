package Task;

public class Task16 {
    
}


interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // lather, rinse, repeat
        if (timeToEat) {
            // put gorilla food into cage
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        //  Groom the gorilla (e.g., brush fur)
        System.out.println("Grooming the gorilla");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Attempting to pet the gorilla...");
    }
}