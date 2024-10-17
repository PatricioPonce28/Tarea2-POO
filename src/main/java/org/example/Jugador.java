public class Jugador {
    String nombre;
    String posicion;
    int edad;
    int num_camiseta;

    public Jugador (String nombre, String posicion, int edad, int num_camiseta){
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.num_camiseta = num_camiseta;
    }

    public void info_jugador(){
        System.out.println("El jugador: " + nombre + " tiene: "
                + edad + " años ,"+ " y juega en la posición de " + posicion +
                "con el número" + num_camiseta);
    }
}
