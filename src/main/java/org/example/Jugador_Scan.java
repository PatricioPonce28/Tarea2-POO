public class Jugador_Scan {
    String nomb;
    String posi;
    int eda;
    int cami;

    public Jugador_Scan (String nomb, String posi, int eda, int cami){
        this.nomb = nomb;
        this.posi = posi;
        this.eda = eda;
        this.cami = cami;
    }

    public void info_jugador(){
        System.out.println("El jugador: " + nomb + " tiene: "
                + eda + " años ,"+ " y juega en la posición de " + posi +
                "con el número" + cami);
    }
}
