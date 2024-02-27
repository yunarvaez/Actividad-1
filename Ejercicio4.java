package Actividad_1;

public class Ejercicio4 {
    public static void main(String[] args) {
        int EDJUAN,EDALBER, EDANA, EDMAMA;
        EDJUAN = 9;
        EDALBER = 2*EDJUAN/3;
        EDANA = 4*EDJUAN/3;
        EDMAMA = EDJUAN + EDALBER + EDANA;
        System.out.printf("Las edades son:\nAlberto: %s\nJuan: %s\nAna: %s\nMamá: %s", EDALBER, EDJUAN, EDANA, EDMAMA);
    }
}