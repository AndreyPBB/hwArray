package com.dmdev.lesson7.hw;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами,
 * только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 *                                          [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] ->              [0, 0]
 *                                          [1, 9, 3]
 */
public class Task3 {
    public static void main(String[] args) {
        int[] values = {-4, 0, 1, 9, 0, -18};
        int[] negative = new int[2];
        int[] nul = new int[2];
        int[] positive = new int[2];

        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                negative[i] = values[i];
                i++;
            }
            else if (values[i] == 0) {
                nul[i] = values[i];
                i++;
            }
            else {
            positive[i] = values[i];
            i++;
            }

        }

    }
}
