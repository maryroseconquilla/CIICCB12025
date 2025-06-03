package Task;

class Point {
    private double x;
    private double y;
   
    public Point(double x, double y) {
        this.x = 8;
        this.y = 4;
    }
   
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
   
    public void scale() {
        this.x *= 4;
        this.y *= 2;
    }
}

public class Task12 {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
