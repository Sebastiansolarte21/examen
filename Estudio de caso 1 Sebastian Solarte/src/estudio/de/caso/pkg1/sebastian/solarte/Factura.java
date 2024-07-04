/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg1.sebastian.solarte;

/**
 *
 * @author Aulas Heredia
 */
public class Factura {
     public String CalcularBonificacion;
     public int montoFactura;
     public int sumarPuntosVendedor;

    public Factura(String CalcularBonificacion, int montoFactura, int sumarPuntosVendedor) {
        this.CalcularBonificacion = CalcularBonificacion;
        this.montoFactura = montoFactura;
        this.sumarPuntosVendedor = sumarPuntosVendedor;
    }

    public String getCalcularBonificacion() {
        return CalcularBonificacion;
    }

    public void setCalcularBonificacion(String CalcularBonificacion) {
        this.CalcularBonificacion = CalcularBonificacion;
    }

    public int getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(int montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getSumarPuntosVendedor() {
        return sumarPuntosVendedor;
    }

    public void setSumarPuntosVendedor(int sumarPuntosVendedor) {
        this.sumarPuntosVendedor = sumarPuntosVendedor;
    }
     

    
     
}

    