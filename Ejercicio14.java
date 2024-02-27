package Actividad_1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        double numero, cuadrado, cubo;
        Scanner num = new Scanner(System.in);
        numero = num.nextDouble();
        cuadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero,3);
        System.out.printf("El cuadrado del número es %.1f su cubo es %.1f", cuadrado, cubo);
        num.close();
    }
}
