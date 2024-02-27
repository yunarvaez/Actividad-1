package Actividad_1;

public class Ejercicio5 {
    public static void main(String[] args) {
        double suma, x, y;
        suma = 0;
        x = 20;
        suma += x;
        y = 40;
        x  = x + Math.pow(y,2);
        suma = suma + (x/y);
        System.out.printf("El valor de la suma es: %.1f", suma);
    }
}