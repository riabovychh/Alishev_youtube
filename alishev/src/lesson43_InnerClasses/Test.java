package lesson43_InnerClasses;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery(); // по такому синтаксису понимаем, что класс Battery вложен в Electrocar


    }
}
