package com.dmdev.lesson7.hw;
import java.util.Arrays;

/**Задание 1
 Дан одномерный массив целых чисел.
 Написать функцию, удаляющую из него все отрицательные элементы
 (удалить - значит создать новый массив с только положительными элементами).
 После удаления - умножить каждый элемент массива на его длину.
 Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]

 Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 main - только для тестирования написанного функционала.
 *
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, -6, 2, 4, -8, 9};
        int[] resultArray = getResultArray(values);
        System.out.print(Arrays.toString(resultArray));
    }

    private static int[] getResultArray(int[] values) {
        int j = 0;
        int[] currentArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                currentArray[j] = values[i];
                j++;
            }
        }
        int[] resultArray = new int[j];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = currentArray[i] * resultArray.length;
        }
        return resultArray;
    }
}



