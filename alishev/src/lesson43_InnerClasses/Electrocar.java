package lesson43_InnerClasses;

public class Electrocar {
    private int id;

    ////// НЕСТАТИЧЕСКИЙ ВЛОЖЕННЫЙ КЛАСС /////////
    // имеет доступ к полям общего класса
    // нужны для того, чтоб показать, что Electrocar неотъемлемо содержит в себе Motor
    // чаще всего private, то есть не рассматривается, как отдельный инстанс
    // можно использовать внутри методов класса, куда он вложен
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    ////// СТАТИЧЕСКИЙ ВЛОЖЕННЫЙ КЛАСС ///////////////////
    // обычно public
    // не имеет доступа к нестатическим полям класса, куда он вложен (к статическим - имеет)
    // когда классы вроде связаны, но не взаимозависимы
    // чаще всего такие классы используются с классом, куда они вложены, где-то извне (типа в Main, уже при операциях)

    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar (int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        int x = 1;

        System.out.println("Electrocar " + id + " is starting...");

        //////// ВЛОЖЕННЫЙ КЛАСС В МЕТОДЕ /////////
        // имеет доступ к статическим и нестатическим полям класса, куда он вложен, и к переменным метода
        // нужны для того, когда нужны типа анонимные классы (только в самом методе), но у этого класса есть название
        // и могут быть инстансы
        class SomeClass {
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
    }
}
