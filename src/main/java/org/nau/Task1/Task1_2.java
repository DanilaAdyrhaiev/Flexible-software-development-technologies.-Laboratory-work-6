package org.nau.Task1;

import java.util.*;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину масиву: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Довжина масиву повинна бути більшою за нуль.");
            return;
        }

        List<Integer> list = new ArrayList<>();
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }

        // Знайдемо повторюючі значення та їх кількість
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer value : list) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        System.out.println("Повторюючі значення:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Значення " + entry.getKey() + " повторюється " + entry.getValue() + " разів.");
            }
        }
    }
}
