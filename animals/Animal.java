package animals;

public class Animal {
    Animal(){
        super();
    }
}
class Bird extends Animal{
    private Bird(String name){
        System.out.print(name);
    }
}
class Test{
    public static void main(String args[]){
        //new Bird("parrot");
    }
}