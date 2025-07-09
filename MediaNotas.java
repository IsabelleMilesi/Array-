import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("\nMédia das notas: %.2f\n", media);
        System.out.println("Notas superiores à média:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.printf("Nota %d: %.2f\n", i + 1, notas[i]);
            }
        }
        scanner.close();
    }
}