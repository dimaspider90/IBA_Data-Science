 package by.iba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
    private int x;
    private int y;
    private int r;

    public Circle(int x, int r) {
        this.x = x;
        this.r = r;
        this.y = 0;
    }

    public Circle() {}

    public void setXR() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите координату X:");
            this.x = scanner.nextInt();
            System.out.println("Введите радиус R:");
            this.r = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не целое число.");
            scanner.next();
        }
    }

    public int getX(){ return this.x; }

    public int getR(){ return this.r; }
}
