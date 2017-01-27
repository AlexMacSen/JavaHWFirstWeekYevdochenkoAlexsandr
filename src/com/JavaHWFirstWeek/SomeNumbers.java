package com.JavaHWFirstWeek;

import java.util.Scanner;

/**
 * Created by Alexandr Yevdochenko 27.01.2017.
 */
public class SomeNumbers {
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
