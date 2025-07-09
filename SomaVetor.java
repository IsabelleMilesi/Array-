import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] V = new int[3];
        int soma = 0;
        for (int i = 0; i < V.length; i++) {
            System.out.print("Digite o valor para V[" + i + "]: ");
            V[i] = scanner.nextInt();
            soma += V[i]; 
        }
        System.out.println("\nA soma dos valores do vetor é: " + soma);
        scanner.close();
    }
}