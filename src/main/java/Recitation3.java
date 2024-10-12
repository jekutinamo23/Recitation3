import java.util.Scanner;

public class Recitation3 {

    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x:");
        double x = scan.nextDouble();

        System.out.print("Enter y:");
        double y = scan.nextDouble();

        Point sixteen = new Point(x, y);
        Point forty = new Point( 14.0,  12.0);
        Circle circle16 = new Circle(sixteen, 16.0);

        Circle circle40 = new Circle( forty ,40.0);

        boolean result = circle16.intersects(circle40);

        System.out.println(result);
    }
}