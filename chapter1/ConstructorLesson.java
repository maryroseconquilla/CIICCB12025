package chapter1;

public class ConstructorLesson {
    //public static void main(String[] args) {
      //  Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
       // System.out.println();
    //}
    public void main(String[] args){
        
    }
}

class Chicken{
    int numEggs=0;
    String name;
        public Chicken(){           //constructor
            name = "Duke";
        }
}

class Swan {
    int numberEggs;
    public static void main(String[] args) {
       Swan mother = new Swan();
       mother.numberEggs=1;  // writing Object fields
       System.out.println("Swan number of eggs "+mother.numberEggs);   // reading
    }
}

class Name{
    String first ="Rose ";
    String last="Conq";
    String full = first + last;
    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.full);
        name1.first="Bilog ";
        name1.last="Dill";
        name1.full=name1.first + name1.last;
        System.out.println(name1.full);
    }
}