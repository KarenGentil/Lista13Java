package lista13;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = {1, 2, 3};
        int[] v2 = {4, 5, 6};
        int[] uniao = new int[v1.length + v2.length];

        for (int i = 0; i < v1.length; i++) {
            uniao[i] = v1[i];
        }
        for (int i = 0; i < v2.length; i++) {
            uniao[v1.length + i] = v2[i];
        }

        System.out.println("União: " + Arrays.toString(uniao));

    }
}
