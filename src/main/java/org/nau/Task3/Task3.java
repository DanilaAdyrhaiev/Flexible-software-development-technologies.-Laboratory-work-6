package org.nau.Task3;

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
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Введіть значення для зміщення: ");
        int shiftValue = scanner.nextInt();

        System.out.println("Початковий масив:");
        printArray(array);

        for (int i = 0; i < M; i++) {
            int temp = array[i][N - 1];
            for (int j = N - 1; j > 0; j--) {
                array[i][j] = array[i][j - 1];
            }
            if (i < M - 1) {
                array[i + 1][0] = temp;
            }
            System.out.println("Ітерація " + (i + 1) + ":");
            printArray(array);
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
