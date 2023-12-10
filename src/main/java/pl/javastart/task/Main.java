package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy: ");
        int size1 = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn: ");
        int size2 = scanner.nextInt();

        if (size1 > 100 || size2 > 100) {
            System.out.println("Liczba kolumn i wierszy musi być mniejsza bądź równa 100");
        } else {

            int[][] array = new int[size1][size2];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = i * j;
                }
            }

            for (int[] row : array) {
                for (int cell : row) {
                    System.out.printf("%5d | ", cell);

                }
                System.out.println();
                System.out.printf("%-7s", "_______");
                System.out.println();
            }
        }
    }
}
