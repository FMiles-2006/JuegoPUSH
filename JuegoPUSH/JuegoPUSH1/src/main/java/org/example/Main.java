public class Main {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();

        System.out.println("Número de cartas en el mazo: " + mazo.getNumeroDeCartas());

        // Robar algunas cartas y mostrarlas
        for (int i = 0; i < 5; i++) {
            Carta carta = mazo.robarCarta();
            System.out.println("Carta robada: " + carta);
        }

        System.out.println("Número de cartas restantes en el mazo: " + mazo.getNumeroDeCartas());
    }
}
