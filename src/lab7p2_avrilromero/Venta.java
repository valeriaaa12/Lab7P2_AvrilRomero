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
    private String id;
    private String idventa;
    public Venta() {
    }

    public Venta(String vendedor, String cliente, double transaccion, String carro,String Id,String Id2) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.transaccion = transaccion;
        this.carro = carro;
        this.id= Id;
        this.idventa=Id2;
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getIdventa() {
        return idventa;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return idventa;
    }

}
