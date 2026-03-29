import java.util.Scanner;

abstract class Shapes {
    abstract void area(float x);
    abstract void area(float x, float y);
}

// Circle class
class Circle extends Shapes {
    void area(float r) {
        float circle = 3.14f * r * r;
        System.out.println("Area of Circle = " + circle);
    }

    void area(float x, float y) {
        // not used
    }
}

// Rectangle class
class Rectangle extends Shapes {
    void area(float l, float w) {
        float rectangle = l * w;
        System.out.println("Area of Rectangle = " + rectangle);
    }

    void area(float x) {
        // not used
    }
}

// Triangle class
class Triangle extends Shapes {
    void area(float b, float h) {
        float triangle = 0.5f * b * h;
        System.out.println("Area of Triangle = " + triangle);
    }

    void area(float x) {
        // not used
    }
}

// Driver class
class AreaDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Rectangle");
        System.out.println("Enter 3 for Triangle");

        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Enter radius:");
            float r = sc.nextFloat();

            Circle c = new Circle();
            c.area(r);
        } 
        else if (num == 2) {
            System.out.println("Enter length and width:");
            float l = sc.nextFloat();
            float w = sc.nextFloat();

            Rectangle r = new Rectangle();
            r.area(l, w);
        } 
        else if (num == 3) {
            System.out.println("Enter base and height:");
            float b = sc.nextFloat();
            float h = sc.nextFloat();

            Triangle t = new Triangle();
            t.area(b, h);
        } 
        else {
            System.out.println("Invalid choice");
        } // End of if-else ladder
		
		sc.close();
		
    } // End of main class
} // End of the program
