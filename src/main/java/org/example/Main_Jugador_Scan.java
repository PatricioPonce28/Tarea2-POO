import java.util.Scanner;

public class Main_Jugador_Scan {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        String nomb, posi;
        int eda, cami;

        System.out.println("Ingrese el nombre del primer jugador: ");
        nomb = ingreso.nextLine();
        System.out.println("Ingrese la edad del primer jugador: ");
        eda = ingreso.nextInt();
        ingreso.nextLine();
        System.out.println("Ingrese la posición en la cancha del primer jugador: ");
        posi = ingreso.nextLine();
        System.out.println("Ingrese el número de camiseta del primer jugador: ");
        cami = ingreso.nextInt();
        ingreso.nextLine();

        Jugador_Scan jugador_scan1 = new Jugador_Scan(nomb, posi, eda, cami);

        System.out.println("Ingrese el nombre del segundo jugador: ");
        nomb = ingreso.nextLine();
        System.out.println("Ingrese la edad del segundo jugador: ");
        eda = ingreso.nextInt();
        ingreso.nextLine();
        System.out.println("Ingrese la posición en la cancha del segundo jugador: ");
        posi = ingreso.nextLine();
        System.out.println("Ingrese el número de camiseta del segundo jugador: ");
        cami = ingreso.nextInt();
        ingreso.nextLine();

        Jugador_Scan jugador_scan2 = new Jugador_Scan(nomb, posi, eda, cami);

        System.out.println("Ingrese el nombre del tercer jugador: ");
        nomb = ingreso.nextLine();
        System.out.println("Ingrese la edad del tercer jugador: ");
        eda = ingreso.nextInt();
        ingreso.nextLine();
        System.out.println("Ingrese la posición en la cancha del tercer jugador: ");
        posi = ingreso.nextLine();
        System.out.println("Ingrese el número de camiseta del tercer jugador: ");
        cami = ingreso.nextInt();
        ingreso.nextLine();

        Jugador_Scan jugador_scan3 = new Jugador_Scan(nomb, posi, eda, cami);

        jugador_scan1.info_jugador();
        jugador_scan2.info_jugador();
        jugador_scan3.info_jugador();

    }
}
