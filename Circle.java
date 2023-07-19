package shapes;
public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        int diameter = 2 * radius;
        int side = diameter + 1;
        int centerX = radius;
        int centerY = radius;

        for (int y = 0; y < side; y++) {
            for (int x = 0; x < side; x++) {
                int distanceX = x - centerX;
                int distanceY = y - centerY;
                double distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);

                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}