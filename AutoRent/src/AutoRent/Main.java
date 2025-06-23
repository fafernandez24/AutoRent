/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutoRent;

import com.formdev.flatlaf.FlatLightLaf;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Camioneta;
import model.Vehiculo;
import view.Menu;

/**
 * 
 *
 * @author Freddy
 */
public class Main {
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException{
        
        
        Camioneta camioneta1 = new Camioneta();
        camioneta1.setCodigoVehiculo(101);
        camioneta1.setNumeroPlaca("ABC123");
        camioneta1.setModelo("Hilux");
        camioneta1.setMarca("Toyota");
        camioneta1.setAño(2022);
        camioneta1.setCostoAdquisicion(25000.0f);
        camioneta1.setPrecioRenta(150.0f);
        camioneta1.setKilometraje(5000);
        camioneta1.setEstado(1);
        camioneta1.setFechaRevision(LocalDate.of(2025, 6, 10));
        camioneta1.setTipo("Pickup");
        camioneta1.setNumeroPasajeros(5);
        camioneta1.setCostoPasaje(3.5f);
        camioneta1.setNumeroPuertas(4);
    
        Camioneta camioneta2 = new Camioneta();
        camioneta2.setCodigoVehiculo(102);
        camioneta2.setNumeroPlaca("XYZ789");
        camioneta2.setModelo("D-Max");
        camioneta2.setMarca("Isuzu");
        camioneta2.setAño(2023);
        camioneta2.setCostoAdquisicion(27000.0f);
        camioneta2.setPrecioRenta(160.0f);
        camioneta2.setKilometraje(2000);
        camioneta2.setEstado(0);
        camioneta2.setFechaRevision(LocalDate.of(2025, 5, 25));
        camioneta2.setTipo("SUV");
        camioneta2.setNumeroPasajeros(8);
        camioneta2.setCostoPasaje(4.2f);
        camioneta2.setNumeroPuertas(5);

       
        // Permite que la interfaz grafica se vea un poco mejor.
        UIManager.setLookAndFeel(new FlatLightLaf());
        
        List<Vehiculo> listaVehiculo = new ArrayList<>();
        
        listaVehiculo.add(camioneta1);
        listaVehiculo.add(camioneta2);
        
        
        Menu openStart = new Menu(listaVehiculo);
        openStart.setVisible(true);
    }
}