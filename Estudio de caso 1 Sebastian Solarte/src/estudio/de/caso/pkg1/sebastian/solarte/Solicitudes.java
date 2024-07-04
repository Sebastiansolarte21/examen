/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg1.sebastian.solarte;

/**
 *
 * @author Aulas Heredia
 */
public class Solicitudes {
    // Se pusieron atributos

    public String nombreCliente;
    public int cedulaCliente;
    public int numeroMes;

    public Solicitudes() {
    }

// se crearon los contructores
    public Solicitudes(String nombreCliente, int cedulaCliente, int numeroMes) {   
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.numeroMes = numeroMes;
    }

//Creacion de getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
       
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

}
