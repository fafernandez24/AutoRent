/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Vehiculo;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuControl {
    
    public static void focusGained(JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
    }
    
    public static void focusLost(JTextField dataEnter, String message){
        String id = dataEnter.getText();
        if (id.trim().isEmpty()) dataEnter.setText(message);
    }
    
    public static void changeButtonColor(JButton button, int r, int g, int b){
        button.setBackground(new Color(r,g,b));
    }
    
    public static void changePanelColor(JPanel panel, int r, int g, int b){
        panel.setBackground(new Color(r,g,b));
    }
    
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
    
    public static int capturarEstadoJComboBox(JComboBox comboBox){
        HashMap<String, Integer> playOff = new HashMap<>();
        playOff.put("0: NO DISPONIBLE", 0);
        playOff.put("1: DISPONIBLE", 1);
        playOff.put("2: EN RENTA", 2);
        playOff.put("3: FUERA DE SERVICIO O RETIRADO", 3);
        return playOff.get(comboBox.getSelectedItem().toString());
    }
    
}
