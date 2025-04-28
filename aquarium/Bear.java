package aquarium;

public class Bear {
    protected void finalize(){
        System.err.println("Roar");
    }
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear = null;
        System.gc();
    }
}
