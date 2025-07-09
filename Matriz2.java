public class Matriz2 {
    public static void main(String[] args) {
        int [][] matriz = new int[3][4];
        for (int i = 0; i<3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                   matriz[i][j] = i + j;
            }
        }
        System.out.println("Matriz:");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j< 4; j++)
            {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}