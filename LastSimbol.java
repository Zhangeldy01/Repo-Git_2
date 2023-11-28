import java.util.Scanner;

// 1.2. Использование методов length() и charAt()
// Ввести строку с клавиатуры и вывести на экран последний символ введенной строки.
// Используем методы length() и charAt().

public class LastSimbol {
    public static void main(String [] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc1.nextLine();
        System.out.println("Последний введенный символ: " + str.charAt(str.length() - 1));

    }
}