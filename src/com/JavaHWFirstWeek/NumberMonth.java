package com.JavaHWFirstWeek;

import java.util.Scanner;

/**
 * Created by user on 27.01.2017.
 */
public class NumberMonth {
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
        String vremernaGoda = null;
        switch (number) {
            case 1:
            case 2:
            case 12:
                vremernaGoda = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                vremernaGoda = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                vremernaGoda = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                vremernaGoda = "Осень";
                break;
        }
        System.out.println(vremernaGoda);
    }
}
