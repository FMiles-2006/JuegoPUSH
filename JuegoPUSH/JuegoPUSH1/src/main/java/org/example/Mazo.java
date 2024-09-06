import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
        crearMazo();
        barajar();
    }

    private void crearMazo() {
        for (int valor = 1; valor <= 6; valor++) {
            for (Color color : Color.values()) {
                for (int i = 0; i < 3; i++) { // Tres cartas por combinación de valor y color
                    cartas.add(new Carta(valor, color));
                }
            }
        }
    }

    private void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta robarCarta() {
        if (cartas.isEmpty()) {
            throw new IllegalStateException("No hay cartas en el mazo.");
        }
        return cartas.remove(cartas.size() - 1);
    }

    public int getNumeroDeCartas() {
        return cartas.size();
    }

    @Override
    public String toString() {
        return "Mazo{" +
                "cartas=" + cartas +
                '}';
    }
}
