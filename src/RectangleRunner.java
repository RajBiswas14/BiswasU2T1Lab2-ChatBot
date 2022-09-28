import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        Rectangle rec1 = new Rectangle(rect1Length, rect1Width);
        Rectangle rec2 = new Rectangle(rect2Length, rect2Width);

        int area1 = rec1.calculateArea();
        int area2 = rec2.calculateArea();
        double volume1 = rec1.calculateBoxVolume(rect1Height);
        double volume2 = rec2.calculateBoxVolume(rect2Height);
        System.out.println("Rectangle 1 area: " + area1 + " box volume: " + volume1 + ".");
        System.out.println("Rectangle 2 area: " + area2 + " box volume: " + volume2 + ".");

    }
}


