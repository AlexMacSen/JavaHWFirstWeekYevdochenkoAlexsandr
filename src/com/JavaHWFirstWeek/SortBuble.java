package com.JavaHWFirstWeek;

import java.util.Arrays;

/**
 * Created by Alexandr Yevdochenko 27.01.2017.
 */
public class SortBuble {
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