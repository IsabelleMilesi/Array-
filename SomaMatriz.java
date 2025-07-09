import java.util.Scanner;
public class SomaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaLinha3 = 0;
        int somaColuna2 = 0;
        int somaTotal = 0;
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somaTotal += matriz[i][j];
                if (i == 2) {
                    somaLinha3 += matriz[i][j];
                }
                if (j == 1) {
                    somaColuna2 += matriz[i][j];
                }
            }
        }
        System.out.println("\nSoma da linha 3: " + somaLinha3);
        System.out.println("Soma da coluna 2: " + somaColuna2);
        System.out.println("Soma de todos os elementos: " + somaTotal);

        scanner.close();
    }
}