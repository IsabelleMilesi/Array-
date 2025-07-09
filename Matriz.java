public class Matriz {
    public static void main(String[] args) {
        int[][] M = new int[3][3];
        M[0][0] = 50;
        M[0][1] = 15;
        M[0][2] = 40;
        M[1][0] = 28;
        M[1][1] = 0;
        M[1][2] = 150;
        M[2][0] = 13;
        M[2][1] = 1;
        M[2][2] = 58;
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

