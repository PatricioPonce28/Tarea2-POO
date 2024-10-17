import java.util.Scanner;

public class main_Empleado {
    public static void main(String[] args){
        String nombre, cargo;
        double salario;
        String fecha_ingreso;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer empleado: ");
        nombre = input.nextLine();
        System.out.println("Ingrese el cargo del primer empleado: ");
        cargo = input.nextLine();
        System.out.println("Ingrese el salario del primer empleado: ");
        salario = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese la fecha del ingreso del primer empleado: ");
        fecha_ingreso = input.nextLine();

        Empleado empleado1 = new Empleado(nombre, cargo, salario, fecha_ingreso);

        System.out.println("Ingrese el nombre del segundo empleado: ");
        nombre = input.nextLine();
        System.out.println("Ingrese el cargo del segundo empleado: ");
        cargo = input.nextLine();
        System.out.println("Ingrese el salario del segundo empleado: ");
        salario = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese la fecha del ingreso del segundo empleado: ");
        fecha_ingreso = input.nextLine();

        Empleado empleado2 = new Empleado(nombre, cargo, salario, fecha_ingreso);

        System.out.println("Ingrese el nombre del tercer empleado: ");
        nombre = input.nextLine();
        System.out.println("Ingrese el cargo del tercer empleado: ");
        cargo = input.nextLine();
        System.out.println("Ingrese el salario del tercer empleado: ");
        salario = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese la fecha del ingreso del tercer empleado: ");
        fecha_ingreso = input.nextLine();

        Empleado empleado3 = new Empleado(nombre, cargo, salario, fecha_ingreso);

        empleado1.info_Empleado();
        empleado2.info_Empleado();
        empleado3.info_Empleado();
    }
}
