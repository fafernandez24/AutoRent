/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static control.MenuControl.capturarEstadoJComboBox;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Freddy
 */
public abstract class Vehiculo {
    
    // Atributos
    
    protected int codigoVehiculo;
    protected String numeroPlaca;
    protected String modelo;
    protected String marca;
    protected int año;
    protected float costoAdquisicion;
    protected float precioRenta;
    protected int kilometraje;
    protected int estado;
    protected LocalDate fechaRevision;
    
    // Metodos
    
    // Constructor #1
    public Vehiculo(){}
    
    // Constructor #2
    public Vehiculo(int codigoVehiculo, String numeroPlaca, String modelo, String marca, int año, float costoAdquisicion, float precioRenta, int kilometraje, int estado, LocalDate fechaRevision) {
        this.codigoVehiculo = codigoVehiculo;
        this.numeroPlaca = numeroPlaca;
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.costoAdquisicion = costoAdquisicion;
        this.precioRenta = precioRenta;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.fechaRevision = fechaRevision;
    }

    // Metodos Getter

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public float getCostoAdquisicion() {
        return costoAdquisicion;
    }

    public float getPrecioRenta() {
        return precioRenta;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getEstado() {
        return estado;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }
    
    // Metodos Setter

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setCostoAdquisicion(float costoAdquisicion) {
        this.costoAdquisicion = costoAdquisicion;
    }

    public void setPrecioRenta(float precioRenta) {
        this.precioRenta = precioRenta;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }
    
    // Validaciones
    
    public boolean validarNumeroDePlaca(){
        return numeroPlaca.matches("^[A-Z0-9]+") && (numeroPlaca.length() <= 8 && numeroPlaca.length() >= 6);  
    }
    
    public boolean validarModelo(){
        return modelo.matches("^[A-Za-z0-9]+") ;  
    }
    
    public boolean validarMarca(){
        return marca.matches("^[A-Za-z]+");  
    }
    
    public boolean validarEstado(){
        return estado <= 3 && estado >= 0;
    }
    
    public boolean validarAnio(){
        return año <= 2030 && año >= 1885;
    }
    
    public boolean validarFecha(String fecha){
        return fecha.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$") && fecha.length() == 10;
    }
    
    // Otros Metodos
    
    public void retirarVehiculo(){
        estado = 3;
    }
    
    public String notificarDisponibilidad(){
        if (estado != 1){
            return "AVISO: No se encuentra disponible este vehiculo.";
        }
        return "AVISO: Vehiculo disponible.";
    }
    
    // Metodos leer
    
    public void leerCodigoVehiculo(JTextField entrada){
        String numeroString;
        try{
            numeroString = entrada.getText();
            codigoVehiculo = Integer.parseInt(numeroString);
        } catch (NumberFormatException error){
            entrada.setText("ERROR. Ingresar un numero entero");  
        } finally {
            if (codigoVehiculo < 0) entrada.setText("ERROR. Ingresar un numero mayor o igual a 0");
        }
    } 
    
    public void leerPlacaVehiculo(JTextField entrada){
            numeroPlaca = entrada.getText().toUpperCase();
    }
    
    public void leerModeloVehiculo(JTextField entrada){
            modelo = entrada.getText();
    }
    
    public void leerMarcaVehiculo(JTextField entrada){
        marca = entrada.getText();
        if (!validarMarca()) entrada.setText("ERROR. Ingresar nada mas letras");
    }
    
    public void leerCostoAdquisicionVehiculo(JTextField entrada){ 
        String numeroString;
        try{
            System.out.print("Ingresar costo de adqusicion del vehiculo: ");
            numeroString = entrada.getText();
            costoAdquisicion= Float.parseFloat(numeroString);
        } catch (NumberFormatException error){
            entrada.setText("ERROR. Ingresar un numero entero o con decimales");
        } finally {
            if (costoAdquisicion < 0) entrada.setText("ERROR. Ingresar un numero mayor o igual a 0");
        }
    }
    
    public void leerPrecioRentaVehiculo(JTextField entrada){
        String numeroString;
        try{
            System.out.print("Ingresar precio de renta del vehiculo: ");
            numeroString = entrada.getText();
            precioRenta = Float.parseFloat(numeroString);
        } catch (NumberFormatException error){
            entrada.setText("ERROR. Ingresar un numero entero o con decimales");
        } finally {
            if (precioRenta < 0) entrada.setText("ERROR. Ingresar un numero mayor o igual a 0");
        }
    }
  
    public void leerAnioVehiculo(JTextField entrada){
        String numeroString;
        try{
            System.out.print("Ingresar año del vehiculo(1885-2030): ");
            numeroString = entrada.getText();
            año = Integer.parseInt(numeroString);
        } catch (NumberFormatException error){
            entrada.setText("ERROR. Ingresar un numero entero");
        } finally {
            if (!validarAnio()) entrada.setText("ERROR. Ingresar un año entre 1885 y 2030");
        }
    }
    
    public void leerKilometrajeVehiculo(JTextField entrada){
        String numeroString;
        try{
            numeroString = entrada.getText();
            kilometraje = Integer.parseInt(numeroString);
        } catch (NumberFormatException error){
            entrada.setText("ERROR. Ingresar un numero entero");  
        } finally {
            if (kilometraje < 0) entrada.setText("Ingresar un numero mayor o igual a 0");
        }
    }
    
    public void leerEstadoVehiculo(JComboBox entrada){
        estado = capturarEstadoJComboBox(entrada);
    }
    
    public void leerFechaRevisionVehiculo(JTextField entrada){
        String fecha;
        fecha = entrada.getText();
        if (!validarFecha(fecha)) entrada.setText("ERROR. Ingresar correctamente la fecha");
        int anio = Integer.parseInt(fecha.substring(6,10));
        int dia = Integer.parseInt(fecha.substring(0,2));
        int mes = Integer.parseInt(fecha.substring(3,5));
        fechaRevision = LocalDate.of(anio, mes, dia);  
    }
    
    public void actualizarVehiculo(JTextField kilometraje, JTextField revision, JTextField placa, JComboBox estado){
        leerKilometrajeVehiculo(kilometraje);
        leerFechaRevisionVehiculo(revision);
        leerPlacaVehiculo(placa);  
        leerEstadoVehiculo(estado);
    }
    
    // Metodos abstractos
    
    public abstract void mostrarInformacion(JTextField placa, JTextField modelo, JTextField marca, JTextField anioVehiculo, JTextField costoAdquisicion, JTextField precioRenta, JTextField kilometraje, JTextField estado, JTextField fechaRevision, JTextField codigo, JTextField extraUno, JTextField extraDos, JTextField extraTres);
    public abstract void precioDeRenta(float porcentaje);
    public abstract void precioDeRenta(float porcentaje, float seguro, float servicioExtra);
    public abstract void mostrarExtra(JLabel extraUno, JLabel extraDos, JLabel extraTres);
    public abstract void determinarMantenimiento(JTextField aviso, JLabel modelo, JLabel kilometraje, JLabel revision);
     
} 