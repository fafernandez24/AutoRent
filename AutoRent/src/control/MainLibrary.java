/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Vehiculo;
import static control.ValidacionLibrary.validarNumeroEntero;
import static control.ValidacionLibrary.validarNumeroFlotante;
import static control.ValidacionLibrary.validarPorcentaje;
import java.util.Scanner;

/**
 *
 * @author Freddy A. Fernández
 */
public class MainLibrary {
    
    // Ingresar datos
    
    public static int leerOpcion(){
        Scanner entrada = new Scanner(System.in);
        String numeroString = "";
        int opcion = 0;
        do{
            try{
                System.out.print("Opcion: ");
                numeroString = entrada.nextLine();
                opcion = Integer.parseInt(numeroString);
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar una opcion valida");  
            }
        } while (!validarNumeroEntero(numeroString));
        return opcion;
    }
    
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
    
    // Menus
    
    public static int menu(){
        int opcion = 0;
        System.out.println("(1) Agregar vehiculo");
        System.out.println("(2) Actualizar informacion del vehiculo");
        System.out.println("(3) Calcular y mostrar precio de renta");
        System.out.println("(4) Actualizar estado y determinar mantenimiento");
        System.out.println("(5) Informacion del vehiculo");
        System.out.println("(0) Salir");
        do{
            opcion = leerOpcion();
            if (opcion > 5 || opcion < 0) System.out.println("ERROR. Ingresar una opcion valida");
        } while (opcion > 5 || opcion < 0);
        
        return opcion;
    }
    
    public static int calcularRentaMenu(){
        int opcion = 0;
        System.out.println("(1) Calcular renta normal: ");
        System.out.println("(2) calcular renta con extra: ");
        do{
            opcion = leerOpcion();
            if (opcion > 2 || opcion < 1) System.out.println("ERROR. Ingresar una opcion valida");
        } while (opcion > 2 || opcion < 1);
        return opcion;
    }
    
    public static int gestionarRetiroMenu(){
        int opcion = 0;
        System.out.println("(1) Rentar vehiculo");
        System.out.println("(2) Recuperar vehiculo");
        System.out.println("(3) Retirar vehiculo");
        System.out.println("(4) Determinar mantenimiento");    
        do{
            opcion = leerOpcion();
            if (opcion > 4 || opcion < 1) System.out.println("ERROR. Ingresar una opcion valida");
        } while (opcion > 4 || opcion < 1);
        return opcion;
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
    
}
