package com.tuempresa.push;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private int puntos;
    private List<String> mano; // Podrías usar una clase de Carta si tienes una definida

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.mano = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<String> getMano() {
        return mano;
    }

    public void setMano(List<String> mano) {
        this.mano = mano;
    }

    // Métodos para manejar las cartas en la mano
    public void agregarCarta(String carta) {
        mano.add(carta);
    }

    public void eliminarCarta(String carta) {
        mano.remove(carta);
    }

    // Método para mostrar la información del usuario
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                ", mano=" + mano +
                '}';
    }
}
