package Actividad_1;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        double radio, area, circunferencia;
        Scanner r = new Scanner(System.in);
        radio = r.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        System.out.printf("Área: %f\nCircunferencia: %.1f", area,circunferencia);
    }
}
