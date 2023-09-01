/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_avrilromero;

/**
 *
 * @author Valeria Romero
 */
public class Vendedor {

    private String nombre;
    private int cant_carros;
    private double dinero;

    public Vendedor() {
    }

    public Vendedor(String nombre, int cant_carros, double dinero) {
        this.nombre = nombre;
        this.cant_carros = cant_carros;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant_carros() {
        return cant_carros;
    }

    public void setCant_carros(int cant_carros) {
        this.cant_carros = cant_carros;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return nombre + "," + "\n" + cant_carros + "," + "\n" + dinero;
    }

}
