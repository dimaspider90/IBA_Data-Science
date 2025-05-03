package by.iba;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean exit = false;

       while (!exit) {
           System.out.println("\nМеню:");
           System.out.println("1. Ввести окружности");
           System.out.println("2. Завершить работу");
           System.out.print("Выберите опцию: ");
           int choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   Circle circle1 = new Circle();
                   circle1.setXR();
                   Circle circle2 = new Circle();
                   circle2.setXR();
                   Functions f = new Functions();
                   f.compare(circle1,circle2);
                   break;
               case 2:
                   exit = true;
                   System.out.println("Завершение работы программы.");
                   break;
               default:
                   System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2.");
            }
        }
        scanner.close();
    }
}
