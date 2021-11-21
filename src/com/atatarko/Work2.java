package com.atatarko;

public class Work2 {
    /* 1) Найти количество счастливых билетиков на трамвай от 000001 до 999999 -
          те у которых сумма первых 3 цифр равна сумме последних 3  */

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 000001; i <= 999999; i++) {
            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10 % 10;
            int number4 = (i / 100) % 10 % 10 % 10;
            int number5 = (i / 10) % 10 % 10 % 10 % 10;
            int number6 = i % 10 % 10 % 10 % 10;
            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
            }
        }
        System.out.println("Количество счастливых билетиков на трамвай от 000001 до 999999, равно - " + sum + " " + "билета");
    }
}

