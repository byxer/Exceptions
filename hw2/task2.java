import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = sc.nextInt();
            check(num1, num2);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Вы вввели не число!");
        }
    }

    public static void check(int num1, int num2) throws DivisionByZeroException{
        if (num2 == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
        System.out.printf("%d / %d = %.2f", num1, num2, (double) num1/num2);
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message) {
        super(message);
    }
}