package interfaces;

public class Lesson25_Animal implements Info {

    public int id;

    public Lesson25_Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleepingg");
    }


    @Override
    public void showInfo() {       // вызвали метод интерфейса
        System.out.println("Id is: "+this.id);
    }
}
