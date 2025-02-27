public class Lesson4_While {
    public static void main(String[] args) {
        int value = 0;
        while (value < 5) {
            System.out.println("Hello " + value);
            value = value + 1;  // после каждой отработки цикла значение value увеличивается на 1
        }
    }
}
