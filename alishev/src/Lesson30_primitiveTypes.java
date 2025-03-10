public class Lesson30_primitiveTypes {
    public static void main(String[] args) {
//        byte x = 123;  // целые числа от -128 до 127
//        long y = 123;  // целые числа (занимает 64 бита)
//        double a = 12.3; // вещественные числа (занимает 64 бита)
//        float g = 12.2f; // вещественные числа (занимает 32 бита)

        // по дефолту в java все целые числа - int, вещественные - double, поэтому если хотим создать другие,
        // надо в конце указывать первую букву желаемого типа данных (long - лучше с большой, а вообще - не принципиально)
        // по сути указание этой буквы - это явное приведение типов данных

        float f = 123.2f; // явное приведение типов, то есть мы указывааем, что да, этот double(дефолтный) будет float-ом
        float f1 = (float) 124254.62; // то же самое, что строка выше
        int a = 123;
        long l1 = a;  // неявное приведение типов

        // int всегда может быть long-ом, но наоборот - под вопросом
        long l = 17567L; // явное приведение типов, то есть мы указывааем, что да, этот int(дефолтный) будет long-ом
        int x = (int) l; // явное приведение типов, то есть мы указывааем, что да, этот long будет int-ом
        System.out.println(x);

        double d = a;  // тут всё ок, так как double мощнее int-a
        int y = (int)a;  // перевели double в int (в таком кейсе остаток просто отрубается)

        // для округления
        long z = Math.round(f1);  // на выходе получаем long, после округления будет 124255
        System.out.println(z);


        byte bt = (byte)128; // тут мы превысили числовой порог байта, и ушли в самое начало числового ряда (-128)
        // то есть ряд от -128 до 127 закончился, и пошел на новый круг

    }
}
