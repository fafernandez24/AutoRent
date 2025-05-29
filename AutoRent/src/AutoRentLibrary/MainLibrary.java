/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutoRentLibrary;

import AutoRent.Vehiculo;
import static AutoRentLibrary.ValidacionLibrary.validarNumeroEntero;
import static AutoRentLibrary.ValidacionLibrary.validarNumeroFlotante;
import static AutoRentLibrary.ValidacionLibrary.validarPorcentaje;
import java.util.Scanner;

/**
 *
 * @author Freddy A. Fernández
 */
public class MainLibrary {
    
    // Menus
    
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("(1) Agregar vehiculo");
        System.out.println("(2) Actualizar informacion del vehiculo");
        System.out.println("(3) Calcular y mostrar precio de renta");
        System.out.println("(4) Gestion de retiro");
        System.out.println("(5) Informacion del vehiculo");
        System.out.println("(0) Salir");
        System.out.print("Opcion: ");
        int opcion = entrada.nextInt(); 
        return opcion;
    }
    
    public static int calcularRentaMenu(){
        Scanner entrada = new Scanner(System.in); 
        String numeroString = "";
        int opcion = 0;
        do{
            try{
                System.out.println("(1) Calcular renta normal: ");
                System.out.println("(2) calcular renta con extra: ");
                System.out.print("Opcion: ");            
                numeroString = entrada.nextLine();
                opcion = Integer.parseInt(numeroString);
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar una opcion valida");
            }
        } while (!validarNumeroEntero(numeroString));
        return opcion;
    }
    
    public static int gestionarRetiroMenu(){
        Scanner entrada = new Scanner(System.in); 
        String numeroString = "";
        int opcion = 0;
        do{
            try{
                System.out.println("(1) Rentar vehiculo");
                System.out.println("(2) Recuperar vehiculo");
                System.out.println("(3) Retirar vehiculo");
                System.out.println("(4) Determinar mantenimiento");
                System.out.print("Opcion: ");            
                numeroString = entrada.nextLine();
                opcion = Integer.parseInt(numeroString);
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar una opcion valida");
            }
        } while (!validarNumeroEntero(numeroString));
        return opcion;
    }
    
    // Ingresar datos
    
    public static float calcularRentaIngresarPorcentaje(){
        Scanner entrada = new Scanner(System.in); 
        String numeroString = "";
        float porcentaje = 0;
        do{
            try{
                System.out.println("Ingresar porcentaje (0-100): ");           
                numeroString = entrada.nextLine();
                porcentaje = Float.parseFloat(numeroString);
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar un numero entero o decimal");
            }
        } while (!validarNumeroFlotante(numeroString) || !validarPorcentaje(porcentaje));
        return porcentaje;
    } 
    
    public static float calcularRentaIngresarExtra(){
        Scanner entrada = new Scanner(System.in); 
        String numeroString = "";
        float extra = 0;
        do{
            try{
                System.out.print("Ingresar extra: ");           
                numeroString = entrada.nextLine();
                extra = Float.parseFloat(numeroString);
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar un numero entero o decimal");
            }
        } while (!validarNumeroFlotante(numeroString));
        return extra;
    } 
    
    public static float calcularRentaIngresarSeguro(){
        Scanner entrada = new Scanner(System.in); 
        String numeroString = "";
        float seguro = 0;
        do{
            try{
                System.out.print("Ingresar seguro: ");           
                numeroString = entrada.nextLine();
                seguro = Float.parseFloat(numeroString);
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar un numero entero o decimal");
            }
        } while (!validarNumeroFlotante(numeroString));
        return seguro;
    } 
    
    // Procedimientos y funciones
    
    public static void calcularRenta(Vehiculo vehiculo){ 
        int opcion = calcularRentaMenu();
        float porcentaje = calcularRentaIngresarPorcentaje();     
        switch(opcion){
            case 1 -> {
                vehiculo.precioDeRenta(porcentaje);
                System.out.println("El precio de renta es: " + vehiculo.getPrecioRenta());
            }
            case 2 -> {
                float extra = calcularRentaIngresarExtra(), seguro = calcularRentaIngresarSeguro();
                vehiculo.precioDeRenta(porcentaje, seguro, extra);
                System.out.println("El precio de renta es: " + vehiculo.getPrecioRenta());
            }
            default -> {
                System.out.println("ERROR: Ingresar una opcion valida.");
            }
        }
    }
    
    public static void actualizarInformacion(Vehiculo vehiculo){
        vehiculo.leerKilometrajeVehiculo();
        vehiculo.leerEstadoVehiculo();
    }
    
    public static void gestionarRetiro(Vehiculo listaVehiculo){
        int opcion = gestionarRetiroMenu();
        switch(opcion){
            case 1 -> {
                listaVehiculo.setEstado(2);
            }
            case 2 -> {
                listaVehiculo.setEstado(1);
            }
            case 3 -> {
                listaVehiculo.setEstado(3);
            }
            case 4 -> {
                System.out.println(listaVehiculo.determinarMantenimiento());
            }
            default -> {
                System.out.println("ERROR: Ingresar una opcion valida.");
            }    
        }
    }
    
}
