/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static control.ValidacionLibrary.validarNumeroEntero;
import static control.ValidacionLibrary.validarNumeroFlotante;
import java.time.LocalDate;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Freddy
 */
public class Camioneta extends Vehiculo{
    
    // Atributo
    private int numeroPasajeros;
    private float costoPasaje;
    private int numeroPuertas;
    
    // Metodos

    // Constructor #1
    public Camioneta(){}
    
    // Constrcutor #2
    public Camioneta(int numeroPasajeros, float costoPasaje, int numeroPuertas, int codigoVehiculo, String numeroPlaca, String modelo, String marca, int año, float costoAdquisicion, float precioRenta, int kilometraje, int estado, LocalDate fechaRevision, String tipo) {
        super(codigoVehiculo, numeroPlaca, modelo, marca, año, costoAdquisicion, precioRenta, kilometraje, estado, fechaRevision, tipo);
        this.numeroPasajeros = numeroPasajeros;
        this.costoPasaje = costoPasaje;
        this.numeroPuertas = numeroPuertas;
    }

    // Metodos Getter

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public float getCostoPasaje() {
        return costoPasaje;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    // Metodos Setter

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public void setCostoPasaje(float costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // Validaciones
    
    public boolean validarNumeroPasajeros(){
        return numeroPasajeros > 0 && numeroPasajeros <= 80;
    }
    
    public boolean validarNumeroPuertas(){
        return numeroPuertas > 0 && numeroPuertas <= 8;
    }
    
    // Otros Metodos
    
    @Override
    public void precioDeRenta(float porcentaje){
        float partePorcentaje = ((costoAdquisicion*porcentaje)/100);
        precioRenta = costoAdquisicion + partePorcentaje + (2*numeroPasajeros) + (5*numeroPuertas);
    }
    
    @Override
    public void precioDeRenta(float porcentaje, float seguro, float servicioExtra){
        float partePorcentaje = ((costoAdquisicion*porcentaje)/100);
        precioRenta = costoAdquisicion + partePorcentaje + seguro + servicioExtra + (2*numeroPasajeros) + (5*numeroPuertas);
    }
    
    @Override
    public void determinarMantenimiento(JTextField aviso, JLabel modelo, JLabel kilometraje, JLabel revision){
        LocalDate hoy = LocalDate.now();
        modelo.setText(this.modelo);
        kilometraje.setText(String.valueOf(this.kilometraje));
        revision.setText(String.valueOf(this.fechaRevision));
        if (this.kilometraje >= 5000 && fechaRevision.isBefore(hoy.minusYears(1))){
            aviso.setText("Llevar el vehiculo a mantenimiento. Se recomienda su retiro temporal...");
        }
        else{
            aviso.setText("No es necesario llevar el vehiculo a mantenimiento...");
        }
    }
    
    // Metodos leer
    
    public void leerNumeroAsientosVehiculo(){
        String numeroString = "";
        do{
            try{
                System.out.print("Ingresar el numero de asientos de la camioneta (1-100): ");
                numeroString = entrada.nextLine();
                numeroPasajeros = Integer.parseInt(numeroString);
            }
            catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar un numero entero entre 1 y 100");
            } finally {
                if (!validarNumeroPasajeros()) System.out.println("ERROR. Ingresar un numero de asientos valido");
            }
        } while (!validarNumeroEntero(numeroString) || !validarNumeroPasajeros());
    }
    
    public void leerCostoPasajeVehiculo(){
        String numeroString = ""; 
        do{
            try{
                System.out.print("Ingresar el costo del pasaje del vehiculo: ");
                numeroString = entrada.nextLine(); 
                costoPasaje = Float.parseFloat(numeroString);
            } 
            catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar un numero entero o decimal");
            } finally {
                if (costoPasaje < 0) System.out.println("ERROR. Ingresar un numero mayor o igual a 0");
            }
        } while (!validarNumeroFlotante(numeroString) || costoPasaje < 0);
    }
    
    public void leerNumeroPuertasVehiculo(){
        String numeroString = ""; 
        do{
            try{
                System.out.print("Ingresar el numero de puertas de la camioneta (1-8): ");
                numeroString = entrada.nextLine();
                numeroPuertas = Integer.parseInt(numeroString) ;
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar un numero entero entre 1 y 8");
            } finally {
                if (!validarNumeroPuertas()) System.out.println("ERROR. Ingresar un numero entre 1 y 8");
            }
        } while (!validarNumeroEntero(numeroString) || !validarNumeroPuertas()); 
    }
    
    public String mostrarInformacion(){
        return "Codigo de la camioneta: " + codigoVehiculo +
            "\nNumero de placa: " + numeroPlaca +
            "\nModelo de la camioneta: " + modelo +
            "\nMarca de la camioneta: " + marca +
            "\nAño de fabricacion de la camioneta: " + año + 
            "\nCosto de adquisicion de la camioneta: " + costoAdquisicion + 
            "\nPrecio de renta: " + precioRenta + 
            "\nKilometraje acumulado: " + kilometraje +
            "\nEstado de la camioneta: " + estado +
            "\nFecha de la ultima revision de la camioneta: " + fechaRevision +
            "\nNumero de asientos para pasajeros: " + numeroPasajeros +
            "\nCosto del pasaje: " + costoPasaje;
    }
    
    @Override
    public void leerDatos(){
        leerCodigoVehiculo();
        leerPlacaVehiculo();  
        leerModeloVehiculo();
        leerMarcaVehiculo();
        leerCostoAdquisicionVehiculo();
        leerPrecioRentaVehiculo();
        leerAnioVehiculo();
        leerKilometrajeVehiculo();
        leerEstadoVehiculo();
        leerFechaRevisionVehiculo();
        leerNumeroAsientosVehiculo();
        leerCostoPasajeVehiculo();
        leerNumeroPuertasVehiculo();
    }
    
    @Override
    public void mostrarInformacion(JTextField placa, JTextField modelo, JTextField marca, JTextField anioVehiculo, JTextField costoAdquisicion, JTextField precioRenta, JTextField kilometraje, JTextField estado, JTextField fechaRevision, JTextField codigo, JTextField extraUno, JTextField extraDos, JTextField extraTres){
       placa.setText(this.numeroPlaca);
       modelo.setText(this.modelo);
       marca.setText(this.marca);
       anioVehiculo.setText(String.valueOf(this.año));
       costoAdquisicion.setText(String.valueOf(this.costoAdquisicion));
       precioRenta.setText(String.valueOf(this.precioRenta));
       kilometraje.setText(String.valueOf(this.kilometraje));
       estado.setText(String.valueOf(this.estado));
       fechaRevision.setText(String.valueOf(this.fechaRevision));
       codigo.setText(String.valueOf(this.codigoVehiculo));
       extraUno.setText(String.valueOf(this.numeroPasajeros));
       extraDos.setText(String.valueOf(this.costoPasaje));
       extraTres.setText(String.valueOf(this.numeroPuertas));
    }
    
}

