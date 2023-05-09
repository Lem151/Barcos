/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elvik
 */
public abstract class Barco {
    protected int metrosEslora;

    public Barco(int metrosEslora) {
        this.metrosEslora = metrosEslora;
        System.out.println("Se ha creado un barco con " + metrosEslora + " metros de eslora.");
    }

    public void alarma() {
        System.out.println("Alarma desde el barco " + getClass().getSimpleName());
    }

    public void mensajeSocorro(String mensaje) {
        alarma();
        System.out.println("Mensaje de socorro: " + mensaje);
    }
}
