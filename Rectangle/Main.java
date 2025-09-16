import rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide width and height as command line arguments.");
            return;
        }

        int width, height;

        try {
            width = Integer.parseInt(args[0]);
            height = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide two integers for width and height.");
            return;
        }

        Rectangle rect = new Rectangle(width, height);

        System.out.println("Perimeter: " + rect.getPeremeter());
        System.out.println("Area: " + rect.getArea());
    }
}


