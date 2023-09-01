/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_avrilromero;

import java.awt.Color;

/**
 *
 * @author Valeria Romero
 */
public class Vehiculo {
   private int id;
   private String Marca;
   private Color color;
   private String modelo;
   private int year;
   private double precio;

    public Vehiculo() {
    }

    public Vehiculo(int id, String Marca, Color color, String modelo, int year, double precio) {
        this.id = id;
        this.Marca = Marca;
        this.color = color;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return id+","+"\n"+Marca+","+"\n"+modelo+","+"\n"+year+","+"\n"+precio+"\n";
    }
   
}
