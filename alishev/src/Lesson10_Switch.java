import java.util.Scanner;

public class Lesson10_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("You are born");
                break;
            case 7:
                System.out.println("You go to school");
                break;
            case 18:
                System.out.println("You finished the school");
                break;
            default:                 // после дефолта брейк не нужен
                System.out.println("Ни одно из предыдущих условий не подошло"); // если не прописать брейк, то если будет неописанный кейс, не выполнится ничего
        }


        Scanner scanner2 = new Scanner(System.in);  // можно и текст задавать в кейсах
        System.out.println("Enter your age: ");
        String age2 = scanner2.nextLine();
        switch (age2) {
            case "zero":
                System.out.println("You are born");
                break;
            case "seven":
                System.out.println("You go to school");
                break;
            case "eighteen":
                System.out.println("You finished the school");
                break;
        }
    }
}
