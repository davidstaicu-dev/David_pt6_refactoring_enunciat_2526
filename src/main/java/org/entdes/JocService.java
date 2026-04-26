package org.entdes;

public class JocService {

    public int jugar(int eleccioJugador1, int eleccioJugador2) {
        if (eleccioJugador1 < 1 || eleccioJugador1 > 3 || eleccioJugador2 < 1 || eleccioJugador2 > 3) {
            return -1;
        }
        if (eleccioJugador1 == eleccioJugador2) {
            return 0;
        }
        if ((eleccioJugador1 == 1 && eleccioJugador2 == 3) ||
            (eleccioJugador1 == 2 && eleccioJugador2 == 1) ||
            (eleccioJugador1 == 3 && eleccioJugador2 == 2)) {
            return 1;
        }
        return 2;
    }

    public String getNomJugada(int valorJugada) {
        switch (valorJugada) {
            case 1: return "Pedra";
            case 2: return "Paper";
            case 3: return "Tisores";
            default: return "?";
        }
    }

    public String getResultatText(int estatJoc) {
        switch (estatJoc) {
            case 0: return "EMPAT!";
            case 1: return "GUANYA JUGADOR 1!";
            case 2: return "GUANYA JUGADOR 2!";
            default: return "Jugada no vàlida";
        }
    }
}
