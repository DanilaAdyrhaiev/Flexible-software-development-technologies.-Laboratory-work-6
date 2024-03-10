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

        for (int i = 0; i < length - 1; i++) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            System.out.println("Ітерація " + (i + 1) + ":");
            printArray(array);
        }

        array[length - 1] = shiftValue;
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
