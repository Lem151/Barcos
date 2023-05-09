/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elvik
 */
public class Crucero extends Barco {
    private int camasOcupadas;

    public Crucero(int metrosEslora) {
        super(metrosEslora);
        this.camasOcupadas = 0;
    }

    public int getCamasOcupadas() {
        return camasOcupadas;
    }

    public void setCamasOcupadas(int camasOcupadas) {
        this.camasOcupadas = camasOcupadas;
    }
}
