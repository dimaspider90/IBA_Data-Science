package Entity;

public class Functions {
    public Functions (){}
    public void compare(Circle circle1, Circle circle2) {
        int distance = Math.abs(circle1.getX() - circle2.getX());
        int radiusSum = circle1.getR() + circle2.getR();
        int radiusDiff = Math.abs(circle1.getR() - circle2.getR());

        if (distance > radiusSum) {
            System.out.println("Окружности не пересекаются, расположены отдельно на оси.");
        } else if (distance == radiusSum) {
            System.out.println("Окружности соприкасаются в одной точке.");
        } else if (distance < radiusDiff) {
            System.out.println("Окружности не пересекаются. Присутствует вхождение.");
        } else if (distance == radiusDiff) {
            System.out.println("Окружности соприкасаются в одной точке. Присутствует вхождение.");
        } else {
            System.out.println("Окружности пересекаются в двух точках.");
        }
    }
}
