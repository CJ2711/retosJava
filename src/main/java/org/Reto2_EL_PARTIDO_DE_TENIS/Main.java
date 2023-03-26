package org.Reto2_EL_PARTIDO_DE_TENIS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /**
     * @param secuence to get the data of the Players who win the sets
     * @return String "output": show storie of the set
     **/
    public static void tennis(ArrayList<String> secuence) {
        int ptosP1 = 0;
        String outputP1 = "Love"; //init with Default value

        int ptosP2 = 0;
        String outputP2 = "Love"; //init with Default value

        int lenData = secuence.toArray().length;
        String genOutput = "";
        String player;

        Map<Integer, String> pointsMap = new HashMap<Integer, String>() {{
            put(0, "Love");
            put(1, "15");
            put(2, "30");
            put(3, "40");
            put(4, "Deuce");
            put(5, "Ventaja P1");
            put(6, "Ventaja P2");
        }};


        for (int i = 0; i < lenData; i++) {
            // i = ronda
            player = secuence.get(i);

            if (player == "P1") {
                ptosP1++;
                outputP1 = pointsMap.get(ptosP1);
            } else {
                ptosP2++;
                outputP2 = pointsMap.get(ptosP2);
            }
            genOutput = outputP1 + " - " + outputP2;

            if (ptosP1 >= 3 && ptosP2 >= 3) {

                if (ptosP1 - ptosP2 == 0) {
                    genOutput = pointsMap.get(4);
                } else {
                    if (ptosP1 - ptosP2 > 0) {
                        genOutput = pointsMap.get(5);
                    } else {
                        genOutput = pointsMap.get(6);
                    }
                }
                if (ptosP1 - ptosP2 == 2) {
                    genOutput = "Ha ganado el P1";
                } else if (ptosP1 - ptosP2 == -2) {
                    genOutput = "Ha ganado el P2";

                }

            }
            System.out.println("[" + i + "] " + genOutput);
        }

    }


    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
         * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
         * gane cada punto del juego.
         *
         * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
         * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
         *   15 - Love
         *   30 - Love
         *   30 - 15
         *   30 - 30
         *   40 - 30
         *   Deuce
         *   Ventaja P1
         *   Ha ganado el P1
         * - Si quieres, puedes controlar errores en la entrada de datos.
         * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
         */

        ArrayList<String> secuence = new ArrayList(List.of("P2", "P2", "P1", "P1", "P2", "P1", "P2", "P2"));
        tennis(secuence);
    }
}
