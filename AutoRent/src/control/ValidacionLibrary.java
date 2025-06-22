/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Freddy A. Fernández
 */
public class ValidacionLibrary {
       
    // Validaciones 
    
    public static boolean validarNumeroEntero(String numero){
        return numero.matches("^[0-9]+");
    }
    
    public static boolean validarNumeroFlotante(String numero){
        return numero.matches("[\\d]*\\.?[\\d]*");
    }
    
    public static boolean validarPorcentaje(float porcentaje){
        return porcentaje > -1 && porcentaje <= 100;
    } 
    
}
