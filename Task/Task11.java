package Task;

public class Task11 {
    public static void main(String[] args) {
        printBooks("1:","2:","3:");    
        printtitles("Java Programming","Python Basics","C++ Essentials");
    }
    public static void printBooks(String...names) {
        for (int i =0; i < names.length; i++){
            System.out.println("Book " + names[i] + "\n" + "Title :" );
        }
    }
    public static void printtitles(String...titles) {
        for (int i =0; i < titles.length; i++){
            System.out.println("Title: " + titles[i]);
        }
    } 
    
}