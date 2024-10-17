public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Moises Caicedo", "Mediocampista", 22, 25);
        Jugador jugador2 = new Jugador("Manuel Neuer", "Arquero", 38, 1);
        Jugador jugador3 = new Jugador("Harry Kane", "Delantero", 31, 9);

        jugador1.info_jugador();
        jugador2.info_jugador();
        jugador3.info_jugador();
    }
}