package org.nau.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину масиву: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Довжина масиву повинна бути більшою за нуль.");
            return;
        }

        int[] array = new int[length];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Введіть значення для зміщення: ");
        int shiftValue = scanner.nextInt();

        System.out.println("Початковий масив:");
        printArray(array);

        for (int i = 0; i < shiftValue; i++) {
            int[] copyArray = new int[array.length];
            System.arraycopy(array, 0, copyArray, 1, length-1);
            copyArray[0] = array[length-1];
            array = copyArray;
            printArray(array);
        }
        System.out.println("Остаточний масив після зміщення:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
