public class Lesson38_ScannerException extends Exception{
    public Lesson38_ScannerException (String description){
        super(description); // наследуем конструктор класса Exception с вводом стринги как месседжа
        // введенный тут текст будет выведен в красном тексте после названия ексепшена
    }

}
