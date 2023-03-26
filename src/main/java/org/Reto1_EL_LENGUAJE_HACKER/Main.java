package org.Reto1_EL_LENGUAJE_HACKER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
    /**
     * @param input String a traducir a LeetCode
     * @return String "output": input traducido a L33tCode
     **/
    public static String transformToLeet(String input) {
        String output = "", letter, newLetter;
        int countInput = input.length(), indexData;
        input = input.toLowerCase();


        ArrayList<String> abc = new ArrayList<String>(
                Arrays.asList(
                        "a", "b", "c", "d", "e", "f", "g",
                        "h", "i", "j", "k", "l", "m",
                        "n", "o", "p", "q", "r", "s",
                        "t", "u", "v", "w", "x",
                        "y", "z"));

        ArrayList<String> leetAbc = new ArrayList<String>(
                Arrays.asList(
                        "4", "I3", "[", ")", "3", "|=", "&",
                        "#", "1", ",_|", ">|", "1", "/\\/\\",
                        "^/", "0", "|*", "(_,)", "I2", "5",
                        "7", "(_)", "\\/", "\\/\\/", "><",
                        "j", "2"));

        for (int i = 0; i < countInput; i++) {
            letter = String.valueOf(input.charAt(i));
            indexData = abc.indexOf(letter);
            newLetter = leetAbc.get(indexData);
            output = output + newLetter;
        }
        return output;
    }

    /**
     * Codigo Optimizado
     * @param input String a traducir a LeetCode
     * @return String "output": input traducido a L33tCode
     **/
    public static String transformToLeet2(String input) {
        String output = "";
        input = input.toLowerCase();

        Map<Character, String> leet = new HashMap<Character, String>() {{
            put('a', "4");
            put('b', "I3");
            put('c', "[");
            put('d', ")");
            put('e', "3");
            put('f', "|=");
            put('g', "&");
            put('h', "#");
            put('i', "1");
            put('j', ",_|");
            put('k', ">|");
            put('l', "1");
            put('m', "/\\/\\");
            put('n', "^/");
            put('o', "0");
            put('p', "|*");
            put('q', "(_,)");
            put('r', "I2");
            put('s', "5");
            put('t', "7");
            put('u', "(_)");
            put('v', "\\/");
            put('w', "\\/\\/");
            put('x', "><");
            put('y', "j");
            put('z', "2");
            put(' ', "_");
        }};

        for (char letter : input.toCharArray()) {
            if (leet.containsKey(letter)) {
                output = output + leet.get(letter);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        /*
         * Escribe un programa que reciba un texto y transforme lenguaje natural a
         * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
         *  se caracteriza por sustituir caracteres alfanuméricos.
         * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
         *   con el alfabeto y los números en "leet".
         *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
         */
        System.out.println(transformToLeet2("hola como estas"));
    }
}