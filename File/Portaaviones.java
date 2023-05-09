/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elvik
 */
public class Portaaviones extends Barco {
    private int numAviones;
    private int numMarinos;

    public Portaaviones(int metrosEslora, int numAviones, int numMarinos) {
        super(metrosEslora);
        this.numAviones = numAviones;
        this.numMarinos = numMarinos;
    }

    public int getNumAviones() {
        return numAviones;
    }

    public void setNumAviones(int numAviones) {
        this.numAviones = numAviones;
    }

    public int getNumMarinos() {
        return numMarinos;
    }

    public void setNumMarinos(int numMarinos) {
        this.numMarinos = numMarinos;
    }
}
