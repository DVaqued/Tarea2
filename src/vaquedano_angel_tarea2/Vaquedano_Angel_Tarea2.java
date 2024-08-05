/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaquedano_angel_tarea2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Vaquedano_Angel_Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        int ejer;
        while (true) {
            System.out.println("Ingrese '1' si desea ir al ejercicio 'IMPRIMIR DIAGONAL'"
                    + "\nIngrese '2' si desea ir al ejercicio 'PIRAMIDE'"
                    + "\nIngrese '3' si desea ir al ejercicio 'PALINDROMO O NO'");
            System.out.println("Favor ingrese el ejercicio que desea ejecutar: ");
            ejer = lea.nextInt();

            switch (ejer) {

                case 1:
                    
                    String word;
        
                    System.out.println("Favor ingrese una palabra: ");
                    word = lea.next().toUpperCase();

                    for (int cont1 = 0; cont1 < word.length(); cont1++) {
                        
                        for (int contespacio1 = 0; contespacio1 < cont1; contespacio1++) {
                            System.out.print(" ");
                        }

                        System.out.println(word.charAt(cont1));
                    }
                    for (int cont2 = word.length() - 1; cont2 >= 0; cont2--) {

                        for (int contespacio2 = 0; contespacio2 < cont2; contespacio2++) {
                            System.out.print(" ");
                        }

                        System.out.println(word.charAt(cont2));
                    }
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Ingrese el numero de filas para la piramide invertida: ");
                    int numerofilas = lea.nextInt();

                    for (int contador1 = 1; contador1 <= numerofilas; contador1++) {
                        for (int contador2 = 1; contador2 < contador1; contador2++) {
                            System.out.print(" ");
                        }

                        for (int numero = contador1; numero <= numerofilas; numero++) {
                            System.out.print(numero);
                        }

                        for (int numero2 = numerofilas - 1; numero2 >= contador1; numero2--) {
                            System.out.print(numero2);
                        }

                        System.out.println();
                    }
                    break;
                    
                case 3:
                    String palabra;
                    int cantidadpalabras = 0;
                    int numeropalabra = 0;
                    int contlistpal = 0;
                    int contlistnopalindromo = 0;
                    String palabrareversa = "";
                    String listpal = "";
                    String listnopalindromo = "";

                    System.out.println("Favor ingrese la cantidad de palabras: ");
                    cantidadpalabras = lea.nextInt();

                    for (int contadorpalabra1 = 0; contadorpalabra1 < cantidadpalabras; contadorpalabra1++) {
                        numeropalabra = contadorpalabra1 + 1;
                        System.out.println("Favor ingrese la palabra" + numeropalabra + ": ");
                        palabra = lea.next().toLowerCase();
                        for (int contpalindromo = palabra.length() - 1; contpalindromo >= 0; contpalindromo--) {
                            char letra = palabra.charAt(contpalindromo);
                            palabrareversa += letra;

                        }
                        if (palabrareversa.equals(palabra)) {
                            contlistpal++;
                            listpal += contlistpal + ": " + palabra + "\n";

                        } else {
                            contlistnopalindromo++;
                            listnopalindromo += contlistnopalindromo + ": " + palabra + "\n";
                        }
                        palabrareversa = "";

                    }
                    System.out.println("-Resultados-"
                            + "\nPalindromos:"
                            + "\n" + listpal);
                    System.out.println("No palindromos:"
                            + "\n" + listnopalindromo);
                    break;

            }

        }
    }
}
