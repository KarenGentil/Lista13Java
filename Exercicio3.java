package lista13;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = {5.5, 7.2, 3.8, 9.0};
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Média: " + (soma / vetor.length));

    }
}
