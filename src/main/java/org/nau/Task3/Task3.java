package org.nau.Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків (M): ");
        int M = scanner.nextInt();

        System.out.print("Введіть кількість стовпців (N): ");
        int N = scanner.nextInt();

        if (M <= 0 || N <= 0) {
            System.out.println("Розмірність масиву повинна бути більшою за нуль.");
            return;
        }

        int[][] array = new int[M][N];
        Random random = new Random();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        System.out.print("Введіть значення для зміщення: ");
        int shiftValue = scanner.nextInt();

        System.out.println("Початковий масив:");
        printArray(array);

        for (int y = 0; y < shiftValue; y++) {
            int count = 0;
            int[] oneDArray = Arrays.stream(array)
                    .flatMapToInt(Arrays::stream)
                    .toArray();
            int lastElement = oneDArray[oneDArray.length - 1];
            System.arraycopy(oneDArray, 0, oneDArray, 1, oneDArray.length - 1);
            oneDArray[0] = lastElement;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = oneDArray[count];
                    count++;
                }
            }
            printArray(array);
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
