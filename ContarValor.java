import java.util.Scanner;

public class ContarValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][2];
        int contador = 0;
        System.out.println("Digite os valores da matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] == 3) {
                    contador++;
                }
            }
        }
        System.out.println("\nO valor 3 aparece " + contador + " vez(es) na matriz.");
        scanner.close();
    }
}