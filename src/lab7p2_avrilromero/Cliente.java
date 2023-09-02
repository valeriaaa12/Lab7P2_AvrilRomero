/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_avrilromero;

/**
 *
 * @author Valeria Romero
 */
public class Cliente {
    private String nombre;
    private int edad;
    private String profesion;
    private int cant_carros;
    private double sueldo;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String profesion, int cant_carros, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.cant_carros = cant_carros;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCant_carros() {
        return cant_carros;
    }

    public void setCant_carros(int cant_carros) {
        this.cant_carros = cant_carros;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}
