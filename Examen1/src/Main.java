import java.util.*;

public class Main {
    public static void main(String[] args) {

        // los arreglos de bolillas del sorteo y jugada del notario
        int[] bolillasSorteo = {1, 2, 3, 4, 5, 6};
        int[] jugadaNotario = {1, 2, 6, 12, 20, 22, 30};

        // Inicializar contador de aciertos
        int cantidadAciertos2 = 0;
        int cantidadAciertos3 = 0;
        int cantidadAciertos4 = 0;
        int cantidadAciertos5 = 0;
        int cantidadAciertos6 = 0;

        // Recorrer todas las combinaciones posibles de la jugada del notario
        for (int i = 0; i < jugadaNotario.length; i++) {
            int[] jugada = new int[6];
            int index = 0;


            for (int j = 0; j < jugadaNotario.length; j++) {
                if (j != i) {
                    jugada[index++] = jugadaNotario[j];
                }
            }

            int aciertos = 0;

            // Comparar cada número de la jugada con las bolillas del sorteo y contar los aciertos
            for (int k = 0; k < jugada.length; k++) {
                for (int m = 0; m < bolillasSorteo.length; m++) {
                    if (jugada[k] == bolillasSorteo[m]) {
                        aciertos++;
                        break;
                    }
                }
            }


            if (aciertos == 2) {
                cantidadAciertos2++;
            } else if (aciertos == 3) {
                cantidadAciertos3++;
            } else if (aciertos == 4) {
                cantidadAciertos4++;
            } else if (aciertos == 5) {
                cantidadAciertos5++;
            } else if (aciertos == 6) {
                cantidadAciertos6++;
            }
        }

        //  resultados
        System.out.println("Cantidad total de apuestas con 2 aciertos: " + cantidadAciertos2);
        System.out.println("Cantidad total de apuestas con 3 aciertos: " + cantidadAciertos3);
        System.out.println("Cantidad total de apuestas con 4 aciertos: " + cantidadAciertos4);
        System.out.println("Cantidad total de apuestas con 5 aciertos: " + cantidadAciertos5);
        System.out.println("Cantidad total de apuestas con 6 aciertos: " + cantidadAciertos6);


    }
}
