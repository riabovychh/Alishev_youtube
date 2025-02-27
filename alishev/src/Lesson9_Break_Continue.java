public class Lesson9_Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {    // на значении 15 цикл уже не будет отрабатывать
                break;       // как только i будет 15, цикл прервется
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");


        for (int j = 0; j <= 15; j++) {
            if (j % 2 == 0) { // в такую выборку не должны попасть четные числа до 15-ти
                continue;   // если условие выполняется, он возвращает на начало цикла
            }
            System.out.println("Это нечетное число " + j);
        }
    }
}
