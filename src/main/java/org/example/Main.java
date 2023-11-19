package org.example;
/*
Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array
per 0 e gestista sia l'eccezione della divisione che quella di indice non presente nell'array,
leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23,56};
        divideArray(arr, 3);
    }
    public static void divideArray(int[] arr, int index) {
        try {
            System.out.println(arr[index] / 0);
        } catch (ArithmeticException e) {
            System.out.println("Divisione per 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice non presente nell'array");
        }
    }
}