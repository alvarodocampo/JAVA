/*8.4 Declara un array multidimensional 2x2 y muestra todos sus valores.*/

public class Main {
    public static void main (String[] args) {

        int[][] matriz = {
                {2, 4},
                {5, 6}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento [" + i + "][" + j + "] = " + matriz[i][j]);

            }
        }

    }
}