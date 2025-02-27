import java.util.Scanner;

public class Lesson8_DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // cоздали обьект класса сканер
        System.out.println("Enter a number: 5");
        int value = scan.nextInt(); // поле для ввода
        while (value != 5) {    // если будет введено не 5
            System.out.println("Enter 5");
            value = scan.nextInt(); // повторное поле для ввода
        }
        System.out.println("You have entered 5"); // если сразу ввели 5 или на повторный раз - выведется это

        Scanner scan2 = new Scanner(System.in);
        int value2;
        do {                               // таким образом мы избегаем дублирования кода с выводом текста "введи число..."
            System.out.println("Enter 6");
            value2 = scan2.nextInt();
        } while (value2 != 6);
        System.out.println("You have entered number 6");
    }
}
