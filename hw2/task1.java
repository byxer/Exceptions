import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            check(sc.nextInt());
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число!");
        }
    }

    public static void check(int num) throws InvalidNumberException{
        if (num <= 0) throw new InvalidNumberException("Некорректное число");
        System.out.printf("Число корректно! Вы ввели: %d", num);
    }
}

class InvalidNumberException extends Exception{
    public InvalidNumberException(String message) {
        super(message);
    }
}