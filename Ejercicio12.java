package Actividad_1;

public class Ejercicio12 {
    public static void main(String[] args) {
        double horas_trabajadas, valor_hora, retencion, porcentaje_retencion, salario_bruto, salario_neto;
        valor_hora = 5000;
        horas_trabajadas = 48;
        porcentaje_retencion = 0.125;
        salario_bruto = valor_hora * horas_trabajadas;
        retencion = salario_bruto * porcentaje_retencion;
        salario_neto = salario_bruto - retencion;
        System.out.printf("Salario bruto: %.1f\nRetención de la fuente: %.1f\nSalario neto: %.1f%n", salario_bruto, retencion, salario_neto);
    }
}