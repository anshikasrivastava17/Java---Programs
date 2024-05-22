//Write a program in Java to demonstrate multiple inheritance using interfaces 
 

interface A {
    void points(int x, int y);

    void displayPoint();
}

interface B {
    void length(double x);

    void displayLength();
}

class Circle implements A, B {
    private static int count = 0;
    int id;
    int centerX, centerY;
    double radius;

    public Circle(int centerX, int centerY, double radius) // constructor
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.id = ++count; // Auto-increment ID when new Circle object is created

        // Implement A interface methods
        points(centerX, centerY);
        displayPoint();

        // Implement B interface methods
        length(radius);
        displayLength();
    }

    public void points(int x, int y) {
        this.centerX = x;
        this.centerY = y;
    }

    public void displayPoint() {
        System.out.println("Center coordinates= (" + this.centerX + ", " + this.centerY + ")");
    }

    public void length(double radius) {
        this.radius = radius;
    }

    public void displayLength() {
        System.out.println("Radius length= " + this.radius);
    }

    public static void main(String[] args) {
        System.out.println("Circle 1:");
        Circle circle1 = new Circle(2, 2, 4.0);

        System.out.println("Circle 2:");
        Circle circle2 = new Circle(4, 2, 6.0);
    }
}
