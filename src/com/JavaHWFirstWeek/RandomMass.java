package com.JavaHWFirstWeek;

import java.util.Arrays;

/**
 * Created by Alexandr Yevdochenko 27.01.2017.
 */
public class RandomMass {
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
