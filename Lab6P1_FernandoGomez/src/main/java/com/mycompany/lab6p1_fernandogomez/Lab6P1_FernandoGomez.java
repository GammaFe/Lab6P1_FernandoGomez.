package com.mycompany.lab6p1_fernandogomez;

import java.util.Scanner;
import java.util.Random;

public class Lab6P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Suma de Arreglos");
            System.out.println("2. Vocales y Consonantes");
            System.out.println("3. Floor  y Ceiling");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de clases del estudiante1:");
                    int x = entrada.nextInt();
                    double A = estudiante1(x);
                    System.out.println("");
                    System.out.print("Ingrese la cantidad de clases del estudiante2:");
                    int z = entrada.nextInt();
                    double B = estudiante2(z);
                    System.out.println("");
                    double C = A + B;
                    double D = C / (x + z);
                    System.out.println("Promedio de notas de ambos estudiantes: " + D);
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese una cadena: ");
                    String cadena = entrada.nextLine();
                    chain(cadena);
                    break;

                case 3:
                    System.out.println("Ingrese el tamaño del arreglo: ");
                    int tamaño = entrada.nextInt();
                    int[] arreglo = Rango(tamaño);
                    MayorMenor(arreglo);
                    System.out.println("");
                    System.out.println("Arreglo final: ["+arreglo[0]+"]["+arreglo[1]+"]");
                    break;

                case 4:
                    break;
                default:
                    System.out.println("Ingrese un numero valido");
                    break;
            }
        }
        System.out.println("------> Aufweidesen <------");
    }

    public static int estudiante1(int x) {
        Scanner entrada = new Scanner(System.in);
        int y = 0;
        int[] notas1 = new int[x];
        System.out.print("Notas estudiante1:");
        System.out.print("[");
        for (int i = 0; i < notas1.length; i++) {
            int nota = new Random().nextInt((100 - 60) + 1) + 60;
            notas1[i] = nota;
            System.out.print("" + notas1[i] + "");
            if (i < notas1.length - 1) {
                System.out.print(",");
            }
            y = nota + y;
        }
        System.out.print("]");
        return y;
    }

    public static int estudiante2(int z) {
        Scanner entrada = new Scanner(System.in);
        int w = 0;
        System.out.print("Notas estudiante2:");
        int[] notas2 = new int[z];
        System.out.print("[");
        for (int j = 0; j < notas2.length; j++) {
            int nota2 = new Random().nextInt((100 - 60) + 1) + 60;
            notas2[j] = nota2;
            System.out.print("" + notas2[j] + "");
            if (j < notas2.length - 1) {
                System.out.print(",");
            }
            w = nota2 + w;
        }
        System.out.print("]");
        return w;

    }

    public static char chain(String cadena) {
        String acum = "";
        String acum1 = "", acum2 = "";
        String cadena2 = cadena.toLowerCase();
        for (int i = 0; i <= cadena.length() - 1; i++) {
            if ((cadena2.charAt(i) == 'a') || (cadena2.charAt(i) == 'e')
                    || (cadena2.charAt(i) == 'i') || (cadena2.charAt(i) == 'o')
                    || (cadena2.charAt(i) == 'u') || (cadena2.charAt(i) == '@')) {
                acum1 = acum1 + cadena.charAt(i);
            } else {
                acum2 = acum2 + cadena.charAt(i);
            }
            acum = acum1 + acum2;
        }
        System.out.print("Resultado");
        char[] arr = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            arr[i] = acum.charAt(i);
            System.out.print("[" + arr[i] + "]");
        }

        return 'F';
    }

    public static int[] Rango(int X) {
        int[] num = new int[X];
        System.out.println("Arreglo generado: ");
        for (int k = 0; k < num.length; k++) {
            int digit = new Random().nextInt((2570 - 1000) + 1) + 1000;
            num[k] = digit;
            System.out.print("[" + num[k] + "]");
        }
        return num;
    }

    public static int[] MayorMenor(int[] A) {
        int[] arreglo = new int[2];
        int mayor = 0, menor = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < mayor) {
                mayor = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] > menor) {
                menor = A[i];
            }
            arreglo[0] = menor;
            arreglo[1] = mayor;

        }
        return arreglo;
    }
}
