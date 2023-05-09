/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elvik
 */
public class Pesquero extends Barco {
    private int potencia;
    private int numPescadores;

    public Pesquero(int metrosEslora, int potencia, int numPescadores) {
        super(metrosEslora);
        this.potencia = potencia;
        this.numPescadores = numPescadores;
    }
}
