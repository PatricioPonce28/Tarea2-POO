public class Empleado {
    String nombre, cargo;
    double salario;
    String fecha_ingreso;

    public Empleado (String nombre, String cargo, double salario, String fecha_ingreso){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
    }

    public void info_Empleado(){
        System.out.println("Nombre del empleado" + nombre);
        System.out.println("Cargo del empleado" + cargo);
        System.out.println("Salario del empleado" + salario);
        System.out.println("Fecha de ingreso del empleado" + fecha_ingreso);
        System.out.println(" ");

    }
}
