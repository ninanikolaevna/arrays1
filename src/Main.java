import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// task 1-3
        System.out.println("Задачи 1-4");
        //первый массив
        int[] ints1 = new int[3];
        ints1[0] = 1;
        ints1[1] = 2;
        ints1[2] = 3;
        //В консоль вывели все элементы первого массива в верном порядке через запятую.
        {
            for (int i = 0; i < ints1.length; i++) {
                System.out.print(ints1[i]);
                if (i < ints1.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            //Распечатайте на отдельной строчке элементы каждого массива в
            // обратном порядке через запятую. В конце строки запятую ставить не надо.
            // задание 3 с первым массивом
            {
                for (int i = ints1.length - 1; i >= 0; i--) {
                    System.out.print(ints1[i]);
                    if (i != 0) {
                        System.out.print(", ");
                    }
                }
            }

        }
        System.out.println();
        //задача 4
        //Пройдитесь по первому целочисленному массиву и все нечетные числа 
        // в нем сделайте четными (нужно прибавить 1).
        for (int i = 0; i < ints1.length ; i++) {
            if (ints1[i] % 2 != 0) {
                ints1[i]++;
            }
        }
               System.out.println(Arrays. toString(ints1));
        System.out.println();
        //второй массив

        double[] double2 = {1.57, 7.654, 9.986};
        {
            for (int i = 0; i < double2.length; i++) {
                System.out.print(double2[i]);
                if (i < double2.length - 1) {
                    System.out.print(", ");
                }
                //В консоль вывели все элементы второго массива в верном порядке через запятую.
            }
            System.out.println();
            // задача 2 со вторым массивом
            for (int i = double2.length - 1; i >= 0; i--) {
                System.out.print(double2[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
        //третий массив
        char[] chars1 = {'h', '1', 'ы'};
        {
            for (int i = 0; i < chars1.length; i++) {
                System.out.print(chars1[i]);
                if (i < chars1.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        //В консоль вывели все элементы третьего массива в верном порядке через запятую.
        //На одной строчке расположены элементы только одного массива.
        // задача 3 третий массив
        {
            for (int i = chars1.length - 1; i >= 0; i--) {
                System.out.print(chars1[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
        }


    }
}

