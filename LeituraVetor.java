import java.util.Scanner;

public class LeituraVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] V = new int[5];
        for (int i = 0; i < V.length; i++) {
            System.out.print("Digite o valor para V[" + i + "]: ");
            V[i] = scanner.nextInt();
        }
        System.out.println("\nValores do vetor:");
        for (int i = 0; i < V.length; i++) {
            System.out.println("V[" + i + "] = " + V[i]);
        }
        scanner.close();
    }
}