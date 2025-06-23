/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import javax.swing.JLabel;
import model.Vehiculo;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuControl {
    
    public static Vehiculo encontrarVehiculoId(int id, List<Vehiculo> listaVehiculo){
        for (int i = 0; listaVehiculo.size() >= i; i++){
            if(listaVehiculo.get(i).getCodigoVehiculo() == id){
                return listaVehiculo.get(i);
            }
        }
        return null;
    }
    
    public static int encontrarPosicionVehiculoId(int id, List<Vehiculo> listaVehiculo){
        for (int i = 0; listaVehiculo.size() >= i; i++){
            if(listaVehiculo.get(i).getCodigoVehiculo() == id){
                return i;
            }
        }
        return 0;
    }
    
    public static void actualizarEstadoVehiculo(int posicion, List<Vehiculo> vehiculo, int estado){
        vehiculo.get(posicion).setEstado(estado);
    }
    
    public static void calcularRentaBasicaVehiculo(int posicion, List<Vehiculo> vehiculo, float porcentaje, JLabel modelo, JLabel renta){
        vehiculo.get(posicion).precioDeRenta(porcentaje);
        modelo.setText(vehiculo.get(posicion).getModelo());
        renta.setText(String.valueOf(vehiculo.get(posicion).getPrecioRenta()));
    }
    
    public static void calcularRentaExtraVehiculo(int posicion, List<Vehiculo> vehiculo, float porcentaje, float extra, JLabel modelo, JLabel renta){
        vehiculo.get(posicion).precioDeRenta(porcentaje);
        modelo.setText(vehiculo.get(posicion).getModelo());
        renta.setText(String.valueOf(vehiculo.get(posicion).getPrecioRenta()));
    }
    
    
    
}
