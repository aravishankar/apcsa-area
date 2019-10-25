import java.util.Scanner;

public class apcsaArea {
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String shape = "null";
        double radius = 0;
        double length = 0;
        double width = 0;
        double side = 0;
        double base = 0;
        double height = 0;
        double area = 0;

        do 
        {
            System.out.print("Enter a shape: ");
            shape = in.next().toUpperCase();
        } while (!(shape.equals("CIRCLE")) && !(shape.equals("RECTANGLE")) && !(shape.equals("SQUARE")) && !(shape.equals("TRIANGLE")));
        
        switch (shape) {
            case "CIRCLE":
                
                System.out.print("Enter a radius: ");
                radius = in.nextDouble();

                area = Math.PI * Math.pow(radius, 2);

                break;

            case "RECTANGLE":
                
                System.out.print("Enter a length: ");
                length = in.nextDouble();

                System.out.print("Enter a shape: ");
                width = in.nextDouble();

                area = length*width;

                break;

            case "SQUARE":
                
                System.out.print("Enter a side: ");
                side = in.nextDouble();

                area = Math.pow(side, 2);

                break;

            case "TRIANGLE":
                
                System.out.print("Enter a base: ");
                base = in.nextDouble();

                System.out.print("Enter a height: ");
                height = in.nextDouble();

                area = 0.5 * base * height;

                break;
        
            default:
                break;
        }

        System.out.printf("\nArea: %,.2f", area);

        in.close();
    }
    
}