package chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {
        int a = +9;
        int b = 5;
        boolean pass = true;
        System.out.println(+10 - a++  + --b);
        System.out.println(!pass);       
        pass = !pass;        
        System.out.println(a);   
        System.out.println(b);   
        System.out.println(pass);
        System.out.println(5%3);
        System.out.println(6<<1);
        // 1001
        // 0110
        // 1100
        System.out.println(12>>4);
        System.out.println(1<2);
        //System.out.println(1==1);

        //double x = 39.21;
        //float y = 2.1F;
        //short l = 10;
        //short p = 10;

       // int x = 2, z = 3;
       // x = x * z; //6
       // x *=z; //6*3
      //  System.out.println(x);

        byte x = 5;
        byte y = 10;
        int z = x+y;
        System.out.println(z);

    }
}
