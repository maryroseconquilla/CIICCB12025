package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fish {
    public static void main(String[] args) {
        //int numFish = 4;
        //String fishType = "tuna";
        //int anotherFish = numFish + 1;
        //System.out.println(anotherFish + " " + fishType);
        //System.out.println(numFish + " " + 1);

        //* 
        //String s = "Hello";
        //String t = new String(s);
        //if ("Hello".equals(s)) System.out.println("one");
        //if (t == s) System.out.println("two");
        //if (t.equals(s)) System.out.println("three");
        //if ("Hello" == s) System.out.println("four");
        //if ("Hello" == t) System.out.println("five");
        

        //StringBuilder sb = new StringBuilder();
        //sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        //System.out.println(sb);



        //String s1 = "java";
        //StringBuilder s2 = new StringBuilder("java");
        //if (s1 == s2)
        //System.out.print("1");
        //if (s1.equals(s2))
        //System.out.print("2");


        //String letters = "abcdef";
        //System.out.println(letters.length());
        //System.out.println(letters.charAt(3));
        //System.out.println(letters.charAt(6));

        //String numbers = "012345678";
        //System.out.println(numbers.substring(1, 3));
        //System.out.println(numbers.substring(7, 7));
        //System.out.println(numbers.substring(7));


        //String s = "purr";
        //s.toUpperCase();
        //s.trim();
        //s.substring(1, 3);
        //s += " two";
        //System.out.println(s.length());



        //String a = "";
        //a += 2;
        //a += 'c';
        //a += false;
        //if ( a == "2cfalse") System.out.println("==");
        //if ( a.equals("2cfalse")) System.out.println("equals");



        //int total = 0;
        //StringBuilder letters = new StringBuilder("abcdefg");
        //total += letters.substring(1, 2).length();
        //total += letters.substring(6, 6).length();
        //total += letters.substring(6, 5).length();
        //System.out.println(total);


        //StringBuilder numbers = new StringBuilder("0123456789");
        //numbers.delete(2, 8);
        //numbers.append("-").insert(2, "+");
        //System.out.println(numbers);


        //StringBuilder b = "rumble";
        //b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        //System.out.println(b);

        //StringBuilder puzzle = new StringBuilder("Java");
        //puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
        //puzzle.reverse();
        //System.out.println(puzzle);


        //char[]c = new char[2];
        //int length = c.length;
        //System.out.println(length);

        //ArrayList l = new ArrayList();
        //int length = l.size();
        //System.out.println(l);


        //List<String> list = new ArrayList<String>();
        //list.add("one");
        //list.add("two");
        //list.add(7);
        //for(String s : list) System.out.print(s);


        //ArrayList<Integer> values = new ArrayList<>();
        //values.add(4);
        //values.add(5);
        //values.set(1, 6);
        //values.remove(0);
        //for (Integer v : values) System.out.print(v);


        //int[] random = { 6, -4, 12, 0, -10 };
        //int x = 12;
        //int y = Arrays.binarySearch(random, x);
        //System.out.println(y);


        //List<Integer> list = Arrays.asList(10, 4, -1, 5);
        //Collections.sort(list);
        //Integer array[] = list.toArray(new Integer[4]);
        //System.out.println(array[0]);


        //String [] names = {"Tom", "Dick", "Harry"};
        //List<String> list = names.asList();
        //list.set(0, "Sue");
        //System.out.println(names[0]);


        //List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        //Collections.sort(hex);
        //int x = Collections.binarySearch(hex, "8");
        //int y = Collections.binarySearch(hex, "3A");
        //int z = Collections.binarySearch(hex, "4F");
        //System.out.println(x + " " + y + " " + z);


        //List<Integer> ages = new ArrayList<>();
        //ages.add(Integer.parseInt("5"));
        //ages.add(Integer.valueOf("6"));
        //ages.add(7);
        //ages.add(null);
        //for (int age : ages) System.out.print(age);


        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two)
        System.out.println("A");
        else if (one.equals(two))
        System.out.println("B");
        else
        System.out.println("C");
    }
}
