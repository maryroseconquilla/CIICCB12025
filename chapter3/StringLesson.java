package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        //* String name= "fluffy";
        String a ="1";
        a = "0";
        a+="2";
        a+="3";
        //String b = "1";
        //String name2 ="fluffy";
        //String name3 = new String ("fluffy");
        System.out.println(a); //

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }
}
