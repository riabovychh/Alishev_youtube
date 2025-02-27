public class Lesson23_Formating_Strings {
    public static void main(String[] args) {
        System.out.print("Hello");  // просто print не добавляет абзац в конце строки
        System.out.println("World");

        // форматирование строк (printf)
        System.out.printf("this is a string, %s \n", "NICE");  // %s - место, куда должна попасть переменная типа string
        // \n - добавляет абзац в конце строки
        System.out.printf("this is a string, %d \n", 10);  // %d - место, куда должна попасть переменная типа digit
        System.out.printf("%fThis is %s string, %d \n",10.2,"the",100); //%f - место, куда должна попасть переменная типа float
        // в таких кейсах, как сверху, обязательный правильный порядок переменных, как они написаны
        System.out.println();
        System.out.printf("String, %10d \n",532); // 10 в %10d обозначает ширину числа(кол-во символов), которое мы хотим вставить
        System.out.printf("String, %10d \n",100000000);

        System.out.printf("String, %-10d \n",532); // минус центрует все числа по левой стороне
        System.out.printf("String, %-10d \n",1000000000);

        System.out.printf("String %.2f \n", 45.32265);  // %.2f - выводит числа с кол-вом знаков после запятой - 2 (с округлением)
        System.out.printf("String %.2f \n", 45.32);
        System.out.printf("String %.2f \n", 45.338871);
        System.out.printf("String %.2f \n", 45.3238789172);
        System.out.printf("String %.2f \n", 45.39198629);
    }
}
