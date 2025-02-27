import java.util.Scanner;  // импортировали класс сканер, так как он находится в пакете util

public class Lesson7_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // System.in - стандартный входной поток данных
        System.out.println("Enter a text: ");
        String string = scanner.nextLine();  // cчитает с клавиатуры 1 строчку чего-либо
        System.out.println("You entered "+ string);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered "+ number);
    }
}
