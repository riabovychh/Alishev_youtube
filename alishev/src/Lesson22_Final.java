public class Lesson22_Final {
    public static void main(String[] args) {
        // final - для обдозначение переменной, которая не может в дальнейшем меняться
        final int X = 10;
        System.out.println(X);

    }
}

class Test{
    // обычно переменные final еще и static
    public static final  int CONSTANT = 0;

//    public Test (int CONSTANT){  // инициализация для final переменной (не static final)
//        this.CONSTANT = CONSTANT;
//    }

//    public void setCONSTANT(int x){
//        this.CONSTANT = x;   // ругается из-за того, что это константа ( со словом final)
//    }
}