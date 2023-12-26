import java.util.Scanner;

class Main {
    public static String calc(String input) {
        String[] tokens = input.trim().split(" ");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Неподдерживаемая арифметическая операция");
        }

        int a, b;
        try {
            a = Integer.parseInt(tokens[0]);
            b = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неподдерживаемые числа");
        }

        int result;
        switch (tokens[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("");
        }
        if (a>10||b>10){
            throw new ArithmeticException("Введите числа до 10 включительно");
        }

        if (a<1||b<1){
            throw new ArithmeticException("Введите числа от 1 до 10 включительно");
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Result: " + result);
    }
}
