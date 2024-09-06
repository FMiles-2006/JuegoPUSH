package org.example;

public class Carta {
    private int valor;
    private Color color;

    public Carta(int valor, Color color) {
        if (valor < 1 || valor > 6) {
            throw new IllegalArgumentException("El valor de la carta debe estar entre 1 y 6.");
        }
        this.valor = valor;
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carta carta = (Carta) obj;
        return valor == carta.valor && color == carta.color;
    }

    @Override
    public int hashCode() {
        return 31 * Integer.hashCode(valor) + color.hashCode();
    }
}