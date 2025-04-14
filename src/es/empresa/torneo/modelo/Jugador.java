package es.empresa.torneo.modelo;

public class Jugador {
    private String nombre;
    private String rol;

    public Jugador(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }
}
