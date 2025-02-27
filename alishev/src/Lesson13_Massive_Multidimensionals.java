public class Lesson13_Massive_Multidimensionals {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};      // одномерный массив (в одну линию)

        int[][] matrix = {{1,2,3,4,5},
                          {4},
                          {7,8,9}};  // двухмерный массив
        System.out.println(matrix[2][2]);  // выводим значение в третьей строке в третьем столбце (так как нумерация с нуля)
        System.out.println(matrix[1][0]);  // выводим значение в второй строке в первом столбце
        System.out.println(matrix[0][4]);  // выводим значение в первой строке в пятом столбце

        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);

        // вывод двухмерного массива
        int[][] matrix2 = {{1,2,3,5,8},{4,5,6},{7,8,9,11}};
        for (int i = 0; i < matrix2.length; i++) {  // внешний цикл(проходится по строкам)
            for (int j = 0; j < matrix2[i].length; j++) {   // внутренний цикл (проходится по столбцам)
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();   // абзац

        }
    }
}
