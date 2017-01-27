package com.JavaHWFirstWeek;

/**
 * Created by Alexandr Yevdochenko 27.01.2017.
 */
public class SumMass {
    /**
     * Дано массив 5х8, числа находятся в диапазоне [0,100] (созданных случайно).
     * Определить сумму чисел.
     */
    public static void main(String[] args) {

        int[][] matrix = new int[5][8];
        int sum = 0;
        System.out.println("\n" + "Случайно сгенерированній массив: " + "\n");
        for (int i = 0; i < 5; i++) {
            for (int y = 0; y < 8; y++) {
                matrix[i][y] = (int) (Math.random() * 100);
                System.out.print("[" + i + "][" + y + "]=" + matrix[i][y] + "\t");
                sum = sum + matrix[i][y];
            }
            System.out.println("");
        }
        System.out.println("\n" + "Cумма чисел массива =  " + sum);
    }

}
