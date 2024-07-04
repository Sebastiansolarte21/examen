/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.caso.pkg1.sebastian.solarte;
import javax.swing.JOptionPane;
/**
 *
 * @author Aulas Heredia
 */
public class EstudioDeCaso1SebastianSolarte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreCliente;
        int cedulaCliente;
        int numeroMes = 0;
        String sucursal; 
        String vehiculo;
        int facturas;
        // se crearon los input
        nombreCliente = JOptionPane.showInputDialog("Escriba su nombre: ");
        cedulaCliente = (int) Double.parseDouble(JOptionPane.showInputDialog("Escriba su numero de cedula: "));
        numeroMes = (int) Double.parseDouble(JOptionPane.showInputDialog("Escriba el numero de mes en el que estamos: "));
        sucursal = JOptionPane.showInputDialog("Escriba el nombre de la sucursal: ");
        vehiculo = JOptionPane.showInputDialog("cuenta con vehiculo? (si-no) ");
        facturas = (int) Double.parseDouble(JOptionPane.showInputDialog("Cantidad de facturas vendidas: "));


        //se creo una clase usando un constructor
        Solicitudes solicitudes = new Solicitudes(nombreCliente, cedulaCliente, (int) numeroMes);

        // Se llamo a los getters para obtener los valores de los atributos
        System.out.println("Cliente: " + solicitudes.getNombreCliente());
        System.out.println("Cedula: " + solicitudes.getCedulaCliente());
        System.out.println("Mes: " + solicitudes.getNumeroMes());
        System.out.println("Sucursal; " + sucursal);
        System.out.println("Vehiculo; " + vehiculo);
        System.out.println("vendio un total de "  + facturas);
        
   


   

   
    
    }
    
}
