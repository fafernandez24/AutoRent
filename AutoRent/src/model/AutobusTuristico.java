/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static control.ValidacionLibrary.validarNumeroEntero;
import static control.ValidacionLibrary.validarNumeroFlotante;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Freddy
 */
public class AutobusTuristico extends Vehiculo{
    
    // Atributos
    
    private String nombreChofer;
    private String destinoInicial;
    private String destinoFinal;
    private int tiempoRecorrido;
    private boolean sanitario;
    private float gastoGasolina;
    
    // Metodos

    // Constructor #1
    public AutobusTuristico(){}
    
    // Constructor #2
    public AutobusTuristico(String nombreChofer, String destinoInicial, String destinoFinal, int tiempoRecorrido, boolean sanitario, float gastoGasolina, int codigoVehiculo, String numeroPlaca, String modelo, String marca, int año, float costoAdquisicion, float precioRenta, int kilometraje, int estado, LocalDate fechaRevision, String tipo) {
        super(codigoVehiculo, numeroPlaca, modelo, marca, año, costoAdquisicion, precioRenta, kilometraje, estado, fechaRevision, tipo);
        this.nombreChofer = nombreChofer;
        this.destinoInicial = destinoInicial;
        this.destinoFinal = destinoFinal;
        this.tiempoRecorrido = tiempoRecorrido;
        this.sanitario = sanitario;
        this.gastoGasolina = gastoGasolina;
    }

    // Metodos Setter

    public void setNombreChofer(String nombreChofer) {
        this.nombreChofer = nombreChofer;
    }

    public void setDestinoInicial(String destinoInicial) {
        this.destinoInicial = destinoInicial;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    public void setTiempoRecorrido(int tiempoRecorrido) {
        this.tiempoRecorrido = tiempoRecorrido;
    }

    public void setSanitario(boolean sanitario) {
        this.sanitario = sanitario;
    }

    public void setGastoGasolina(float gastoGasolina) {
        this.gastoGasolina = gastoGasolina;
    }
    
    // Metodos Getter    
    
    public float getGastoGasolina() {
        return gastoGasolina;
    }
    
    public String getNombreChofer() {
        return nombreChofer;
    }

    public String getDestinoInicial() {
        return destinoInicial;
    }

    public String getDestinoFinal() {
        return destinoFinal;
    }

    public int getTiempoRecorrido() {
        return tiempoRecorrido;
    }

    public boolean isSanitario() {
        return sanitario;
    }
    
    public boolean validarNombreChofer(){
        return nombreChofer.matches("^[A-Za-z]+");
    }
    
    // Otros metodos
    
    @Override
    public void precioDeRenta(float porcentaje){
        float partePorcentaje = ((costoAdquisicion*porcentaje)/100);
        if (sanitario == true) precioRenta = (float) (costoAdquisicion + (partePorcentaje*2) + (gastoGasolina*0.5) + (tiempoRecorrido*3));
        else precioRenta = (float) (costoAdquisicion + partePorcentaje + (gastoGasolina*0.5) + (tiempoRecorrido*3));
    }
    
    @Override
    public void precioDeRenta(float porcentaje, float seguro, float servicioExtra){
        float partePorcentaje = ((costoAdquisicion*porcentaje)/100);
        if (sanitario == true) precioRenta = (float) (costoAdquisicion + (partePorcentaje*2) + (gastoGasolina*0.5) + (tiempoRecorrido*3));
        else precioRenta = (float) (costoAdquisicion + partePorcentaje + (gastoGasolina*0.5) + (tiempoRecorrido*3)) + (seguro) + (servicioExtra);
    }
    
    @Override
    public void determinarMantenimiento(JTextField aviso, JLabel modelo, JLabel kilometraje, JLabel revision){
        LocalDate hoy = LocalDate.now();
        modelo.setText(this.modelo);
        kilometraje.setText(String.valueOf(this.kilometraje));
        revision.setText(String.valueOf(this.fechaRevision));
        if (this.kilometraje >= 8500 && fechaRevision.isBefore(hoy.minusYears(1))){
            aviso.setText("Llevar el vehiculo a mantenimiento. Se recomienda su retiro temporal...");
        }
        else{
            aviso.setText("No es necesario llevar el vehiculo a mantenimiento...");
        }
    }
    
    // Metodos leer
    
    public void leerNombreChofer(JTextField entrada){
        nombreChofer = entrada.getText();
        if (!validarNombreChofer()) entrada.setText("ERROR. Ingresar un nombre valido");
    }
    
    public void leerDestinoInicial(JTextField entrada){
        destinoInicial = entrada.getText();
    }
    
    public void leerDestinoFinal(JTextField entrada){   
        destinoFinal = entrada.getText();
    }
    
    public void leerTiempoRecorrido(JTextField entrada){
        String numeroString;
        try{
            System.out.print("Ingresar el tiempo que dura el recorrido (en minutos): ");
            numeroString = entrada.getText();
            tiempoRecorrido = Integer.parseInt(numeroString);
        } catch (NumberFormatException error){
            entrada.setText("ERROR. Ingresar un numero entero");
        } finally {
            if (tiempoRecorrido < 0) entrada.setText("ERROR. Ingresar un numero mayor o igual 0");
        }
    }
    
    public void leerGastoGasolina(JTextField entrada){
        String numeroString;
        try{ 
            System.out.print("Ingresar gasolina gastada en el recorrido (en litros): ");
            numeroString = entrada.getText();
            gastoGasolina = Float.parseFloat(numeroString);
        } catch (NumberFormatException error){
            entrada.setText("ERROR. Ingresar un numero entero o con decimales");
        } finally {
            if (gastoGasolina < 0) entrada.setText("ERROR. Ingresar un numero mayor o igual a 0");
        }
    }
    
    public void leerSanitario(JComboBox entrada){
        String baño = entrada.getSelectedItem().toString();
        sanitario = baño.equals("si");
    }
    
    // Metodos mostrar
    
    public String mostrarBaño(boolean bol){
        if (bol == false) return "NO";
        else return "SI";
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
        extraUno.setText(this.nombreChofer);
        extraDos.setText(this.destinoInicial);
        extraTres.setText(String.valueOf(this.destinoFinal));
    }
    
    public void leerDatos(JTextField codigo, JTextField placa, JTextField modelo, JTextField marca, JTextField costo, JTextField renta, JTextField anio, JTextField kilometraje, JComboBox estado, JTextField revision, JTextField chofer, JTextField destinoI, JTextField destinoF, JTextField tiempo, JTextField gasolina, JComboBox sanitario){   
        leerCodigoVehiculo(codigo);
        leerPlacaVehiculo(placa);  
        leerModeloVehiculo(modelo);
        leerMarcaVehiculo(marca);
        leerCostoAdquisicionVehiculo(costo);
        leerPrecioRentaVehiculo(renta);
        leerAnioVehiculo(anio);
        leerKilometrajeVehiculo(kilometraje);
        leerEstadoVehiculo(estado);
        leerFechaRevisionVehiculo(revision);
        leerNombreChofer(chofer);
        leerDestinoInicial(destinoI);
        leerDestinoFinal(destinoF);
        leerTiempoRecorrido(tiempo);
        leerGastoGasolina(gasolina);
        leerSanitario(sanitario);
    }
    
}
