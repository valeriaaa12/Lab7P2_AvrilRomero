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
   private String id;
   private String Marca;
   private String color;
   private String modelo;
   private int year;
   private double precio;

    public Vehiculo() {
    }

    public Vehiculo( String Marca, String color, String modelo, int year, double precio,String id) {
      
        this.Marca = Marca;
        this.color = color;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
        return modelo;
    }
   
}
