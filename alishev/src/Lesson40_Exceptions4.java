import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Lesson40_Exceptions4 {
    public static void main(String[] args) {

        ///  try - catch - catch
        try {
            run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        /// multicatch (если мы хотим несколько исключений обрабатывать одинаково
        try {
            run2();
        } catch (IOException | ParseException e) { // тут указываем несколько ексепшенов
            e.printStackTrace();
        }

        /// обработка всех исключений (всего класса Exception)
        try {
            run3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // catch (ParseException p) {}
        // такая часть кода никогда не выполнится,
        // так как сначала выполняется первый блок catch, а в нем все возможные исключения
    }
    // один метод может пробрасывать несколько разных исключений
    public static void run() throws IOException, ParseException, IllegalArgumentException {
    }

    public static void run2() throws IOException, ParseException, IllegalArgumentException {
    }

    public static void run3() throws IOException, ParseException, IllegalArgumentException {
    }
}
