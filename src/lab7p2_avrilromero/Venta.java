/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_avrilromero;

/**
 *
 * @author Valeria Romero
 */
public class Venta {

    private String vendedor;
    private String cliente;
    private double transaccion;
    private String carro;

    public Venta() {
    }

    public Venta(String vendedor, String cliente, double transaccion, String carro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.transaccion = transaccion;
        this.carro = carro;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(double transaccion) {
        this.transaccion = transaccion;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return vendedor + "," + "\n" + cliente + "," + "\n" + transaccion + "," + "\n" + carro;
    }

}
