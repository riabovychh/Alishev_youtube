public class Lesson23_StringBuilder {
    public static void main(String[] args){
        // работа с обычными классами
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2+string3;
        System.out.println(stringAll);

        // работа с StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" my").append(" friend sb"); // конкатенируем строки с sb (можно чейнингом - цепочкой)
        System.out.println(sb);


    }

}
