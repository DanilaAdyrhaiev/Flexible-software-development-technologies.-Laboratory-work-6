package org.nau.Task1;

import java.util.Scanner;

public class Task1_1 {
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

        // Знайдемо повторюючі значення та їх кількість
        int count;
        System.out.println("Повторюючі значення:");
        for (int i = 0; i < length; i++) {
            count = 1;
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    // Запобігаємо повторному підрахунку для одного значення
                    array[j] = Integer.MIN_VALUE;
                }
            }
            if (count > 1 && array[i] != Integer.MIN_VALUE) {
                System.out.println("Значення " + array[i] + " повторюється " + count + " разів.");
            }
        }
    }
}
