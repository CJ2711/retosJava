package org.Reto3_EL_GENERADOR_DE_CONTRASENAS;


import java.lang.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class Main {
    public static int getRandomRange(int min, int max) {
        Random randomGen = new Random();
        return randomGen.nextInt(max - min + 1) + min;
    }

    public static String makeMayusc(String a) {
        return toUpperCase(a);
    }

    public static String makePassword() {
        String output = "";

        ArrayList<String> abc = new ArrayList<String>(
                Arrays.asList(
                        "a", "b", "c", "d", "e", "f", "g",
                        "h", "i", "j", "k", "l", "m",
                        "n", "o", "p", "q", "r", "s",
                        "t", "u", "v", "w", "x",
                        "y", "z"));

        ArrayList<String> symbols = new ArrayList<String>(
                Arrays.asList("@","-","_","%", "&", "/", "\\"));

        ArrayList<String> numbers = new ArrayList<String>(
                Arrays.asList("1", "2", "3", "4", "5",
                        "6", "7", "8", "9", "0"));


        int iterador = 1;
        int longitud = getRandomRange(8, 16);

        int mayusculas = 0;
        int conNumeros = 0;
        int conSimbolos = getRandomRange(0, 1);

        for (int i = 0; i < longitud; i++) {
            iterador = getRandomRange(1, 4);

            switch (iterador){
                case (1):{
                    //Normal

                    break;
                }
                case (2):{
                    // Mayusculas
                    break;
                }
                case (3):{
                    // Numeros
                    break;
                }
                case (4):{
                    // conSimbolos = getRandomRange(0, 1);
                    break;
                }
            }
            iterador = getRandomRange(1, 4);
            output += i;
        }

        return output;
    }


    public static void main(String[] args) {
        /*
         * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
         * Podrás configurar generar contraseñas con los siguientes parámetros:
         * - Longitud: Entre 8 y 16.
         * - Con o sin letras mayúsculas.
         * - Con o sin números.
         * - Con o sin símbolos.
         * (Pudiendo combinar todos estos parámetros entre ellos)
         */

        System.out.println(makePassword());
    }
}