package es.empresa.torneo;

import es.empresa.torneo.modelo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Bienvenido al sistema de torneos eSports 🕹");

        // Crear torneo
        Torneo torneo = new Torneo("Clash Arena");

        // Crear equipos
        Equipo equipo1 = new Equipo("Dragons");
        Equipo equipo2 = new Equipo("Titans");

        // Crear jugadores
        Jugador j1 = new Jugador("Ana", "Support");
        Jugador j2 = new Jugador("Carlos", "Sniper");
        Jugador j3 = new Jugador("Marta", "Mid");
        Jugador j4 = new Jugador("Leo", "Tank");

        // Agregar jugadores a equipos
        equipo1.agregarJugador(j1);
        equipo1.agregarJugador(j2);
        equipo2.agregarJugador(j3);
        equipo2.agregarJugador(j4);

        // Agregar equipos al torneo
        torneo.agregarEquipo(equipo1);
        torneo.agregarEquipo(equipo2);

        // Mostrar equipos y jugadores
        for (Equipo e : torneo.getEquipos()) {
            System.out.println("Equipo: " + e.getNombre());
            for (Jugador jugador : e.getJugadores()) {
                System.out.println(" - Jugador: " + jugador.getNombre() + " | Rol: " + jugador.getRol());
            }
        }
    }
}
