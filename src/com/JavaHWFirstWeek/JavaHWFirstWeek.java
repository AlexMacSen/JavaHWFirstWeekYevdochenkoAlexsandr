package com.JavaHWFirstWeek;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Alexandr Yevdochenko 25.01.2017.
 */
public class JavaHWFirstWeek {

    public static class NumberMonth {

        /**
         * определение времени года по номеру месяца (используя switch…case)
         */

        public static void main(String[] args) {
            int number = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер месяца(от 1 до 12) :");
            if (in.hasNextInt())
                number = in.nextInt();
            else
                System.out.println("Вы ввели не целое число");
            if (number > 12)
                System.out.println("Вы ввели  число больше 12");
            monthSeek(number);
        }

        public static void monthSeek(int number) {
            String month = null;
            switch (number) {
                case 1:
                    month = "Январь";
                    break;
                case 2:
                    month = "Февраль";
                    break;
                case 3:
                    month = "Март";
                    break;
                case 4:
                    month = "Апрель";
                    break;
                case 5:
                    month = "Май";
                    break;
                case 6:
                    month = "Июнь";
                    break;
                case 7:
                    month = "Июль";
                    break;
                case 8:
                    month = "Август";
                    break;
                case 9:
                    month = "Сентябрь";
                    break;
                case 10:
                    month = "Октябрь";
                    break;
                case 11:
                    month = "Ноябрь";
                    break;
                case 12:
                    month = "Декабрь";
                    break;
            }
            System.out.println(month);
        }
    }


    public static class SomeNumbers {
        /**
         * ввод с клавиатуры в консоль 10  чисел. Определить минимум и максимум и вывести их на экран.
         */

        public static void main(String[] args) {
            float maxNumber = 0, minNumber = 0, number = 0, i = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите десять целых чисел :");
            do {
                if (in.hasNextFloat())
                    number = in.nextFloat();
                else {
                    System.out.println("Вы ввели не целое число");
                    break;
                    }
                 if (i == 0) {
                    maxNumber = number;
                    minNumber = number;
                }
                if (number > maxNumber)
                    maxNumber = number;
                if (number < minNumber)
                    minNumber = number;
                i++;
            } while (i < 10);
            if (i == 10) {
                System.out.println("Максимальное введенное число= " + maxNumber);
                System.out.println("Минимальное введенное число= " + minNumber);
            }

        }

    }

    public static class SumMass {
        /**
         * 	Дано массив 5х8, числа находятся в диапазоне [0,100] (созданных случайно).
         * 	Определить сумму чисел.
         */
        public static void main(String[] args) {

            int[][] matrix = new int[5][8];
            int sum = 0;
            System.out.println("\n" + "Случайно сгенерированній массив: " + "\n");
            for (int i = 0; i < 5; i++) {
                for (int y = 0; y < 8; y++) {
                    matrix[i][y] = (int) (Math.random() * 90) + 10;
                    System.out.print("[" + i + "][" + y + "]=" + matrix[i][y] + "\t");
                    sum = sum + matrix[i][y];
                }
                System.out.println("");
            }
            System.out.println("\n" + "Cумма чисел массива =  " + sum);
        }
    }



    public static class SortBuble {
        /**
         * Сортировка пузырьком (прямая – от меньшего к большему;
         * обратная – от большего к меньшему).
         */

        public static void main(String[] args) {

            int[] massSort = {10, 8, 12, 7, 18, 35, 33, 44, 2, 11};
            System.out.println("Неотсортированній массив: ");
            System.out.println(Arrays.toString(massSort));
            sortBlbGo(massSort);
            sortBlbBack(massSort);
        }

        public static void sortBlbGo(int[] massSort) {

            System.out.println("Отсортированный массив пузырьком от меньшего к большему: ");

            for (int i = massSort.length - 1; i > 0; i--)

            {
                for (int j = 0; j < i; j++) {

                    if (massSort[j] > massSort[j + 1]) {
                        int tmp = massSort[j];
                        massSort[j] = massSort[j + 1];
                        massSort[j + 1] = tmp;

                    }
                }
            }
            System.out.println(Arrays.toString(massSort));
        }

        public static void sortBlbBack(int[] massSort) {

            System.out.println("Отсортированный массив пузырьком от большего к меньшему: ");

            for (int i = massSort.length - 1; i > 0; i--)

            {
                for (int j = 0; j < i; j++) {

                    if (massSort[j] < massSort[j + 1]) {
                        int tmp = massSort[j];
                        massSort[j] = massSort[j + 1];
                        massSort[j + 1] = tmp;

                    }
                }
            }
            System.out.println(Arrays.toString(massSort));
        }
    }

    public static class RandomMass {
        /**
         * Массив из 10-ти  элементов, заполненый произвольно.
         * Скопировать первые три элемента в конец этого же массива с помощью
         * Arraycopy
         */
        public static void main(String[] args) {
            int[] arrayRandom = new int[10];
            for (int i = 0; i < arrayRandom.length; i++) {
                arrayRandom[i] = (int) (Math.random() * 100);
            }
            System.out.println("Произвольно сгенерированный массив: " + "\n" + Arrays.toString(arrayRandom));

            int[] newArrayRandom = arrayRandom;

            System.arraycopy(arrayRandom, 0, newArrayRandom, 7, 3);

            System.out.println("Массив с скопированными первыми тремя элементами в конец массива: " + "\n"
                    + Arrays.toString(newArrayRandom));
        }

    }
}
