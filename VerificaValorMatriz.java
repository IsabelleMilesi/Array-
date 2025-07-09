import java.util.Scanner;
public class VerificaValorMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        System.out.println("Digite os valores da matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.print("\nDigite um valor para verificar se está na matriz: ");
        int valor = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] == valor) {
                    encontrado = true;
                    break;
                }
            }
        }
        if (encontrado) {
            System.out.println("O valor " + valor + " está presente na matriz.");
        } else {
            System.out.println("O valor " + valor + " NÃO está presente na matriz.");
        }

        scanner.close();
    }
}
