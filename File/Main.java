/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elvik
 */
public class Main {
    public static void main(String[] args) {
        Crucero crucero = new Crucero(100);
        crucero.setCamasOcupadas(50);

        Portaaviones portaaviones = new Portaaviones(300, 20, 200);
        portaaviones.setNumAviones(15);
        portaaviones.setNumMarinos(150);

        Pesquero pesquero = new Pesquero(50, 500, 10);

        crucero.alarma();
        crucero.mensajeSocorro("¡Necesitamos ayuda!");

        portaaviones.alarma();
        portaaviones.mensajeSocorro("Estamos bajo ataque");

        pesquero.alarma();
        pesquero.mensajeSocorro("Se nos ha averiado el motor");

    }
}
