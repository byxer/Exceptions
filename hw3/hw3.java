import java.util.InputMismatchException;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = getInt(sc, "Введите число: ");
        int b = getInt(sc, "Введите степень: ");
        PowerCalculator pc = new PowerCalculator();
        try{
            System.out.printf("Результат: %s", pc.calculatePower(a, b));
        }catch (InvalidInputException ex){
            System.out.println(ex.getMessage());
        }
        sc.close();
    }

    public static int getInt(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка: Введено некорректное число. Повторите ввод.");
                scanner.next(); 
            }
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class PowerCalculator {
    public double calculatePower(int a, int b) throws InvalidInputException {
        if (a == 0) {
            throw new InvalidInputException("Ошибка: введено число равное нулю!");
        } else if (b < 0) {
            throw new InvalidInputException("Ошибка: степень меньше нуля!");
        }
        return Math.pow(a, b);

    }
}