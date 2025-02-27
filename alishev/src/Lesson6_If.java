public class Lesson6_If {
    public static void main(String[] args) {
        int myInt = 25;
        if (myInt <10) {
            System.out.println("меньше 10");
        } else if (myInt > 20) {
            System.out.println("больше 20");
        } else {
            System.out.println("от 10 до 20");
        }
        }
    } // если условие выполнится два раза, покажется самый первый вариант (сверху вниз)
//напр, если myInt=5, и условия if(myInt<10)...else if(myInt<20)...else - выдаст результат для if(myInt<10)

