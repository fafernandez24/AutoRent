/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutoRent;

import model.AutobusTuristico;
import model.Camioneta;
import model.Vehiculo;
import control.MainLibrary;
import java.time.LocalDate;

/**
 * 
 *
 * @author Freddy
 */
public class Main {
    
    public static void main(String[] args){
                
        Vehiculo camioneta = new Camioneta(20, 25,2,120, "12GH89F", "Fiesta", "Ford", 2008, 4678, 230, 203608, 1, LocalDate.of(2025, 4, 14));
        Vehiculo autobus = new AutobusTuristico("Freddy Parra","Las Mercedes", "Tucacas", 4,true ,40 ,120, "45JK77P", "70V", "Ferrari", 2022, 300678, 30006 , 50678, 2, LocalDate.of(2008, 4, 16));
        int opcion;
        
        do{
            System.out.println("Objeto Camion | Para ver el objeto autobus, ingresar 0");
            opcion = MainLibrary.menu();
            switch(opcion){            
                
                case 1 -> {
                    camioneta = new Camioneta();
                    camioneta.leerDatos();
                }
                case 2 -> {
                    MainLibrary.actualizarInformacion(camioneta);
                }
                case 3 -> {
                    MainLibrary.calcularRenta(camioneta);
                }
                case 4 -> {
                    MainLibrary.gestionarRetiro(camioneta);
                }
                case 5 -> {
                    System.out.println(camioneta.mostrarInformacion());
                }
                default -> {
                    if (opcion == 0) System.out.println("Pasaste al objeto AutobusTuristico!");
                    else System.out.println("ERROR: Ingresar una opcion valida.");
                }
            }
        } while(opcion != 0); 
        
        do{
            System.out.println("Objeto AutobusTuristico | Para salir del programa, ingresar 0");
            opcion = MainLibrary.menu();
            switch(opcion){            
                
                case 1 -> {
                    autobus = new AutobusTuristico();
                    autobus.leerDatos();
                }
                case 2 -> {
                    MainLibrary.actualizarInformacion(autobus);
                }
                case 3 -> {
                    MainLibrary.calcularRenta(autobus);
                }
                case 4 -> {
                    MainLibrary.gestionarRetiro(autobus);
                }
                case 5 -> {
                    System.out.println(autobus.mostrarInformacion());
                }
                default -> {
                    if (opcion == 0) System.out.println("Hasta pronto!");
                    else System.out.println("ERROR: Ingresar una opcion valida.");
                }
            }
        } while(opcion != 0); 
            
    } 
}