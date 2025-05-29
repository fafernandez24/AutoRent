/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutoRent;

import static AutoRentLibrary.ValidacionLibrary.validarNumeroEntero;
import static AutoRentLibrary.ValidacionLibrary.validarNumeroFlotante;
import java.time.LocalDate;

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
    public AutobusTuristico(String nombreChofer, String destinoInicial, String destinoFinal, int tiempoRecorrido, boolean sanitario, float gastoGasolina, int codigoVehiculo, String numeroPlaca, String modelo, String marca, int año, float costoAdquisicion, float precioRenta, int kilometraje, int estado, LocalDate fechaRevision) {
        super(codigoVehiculo, numeroPlaca, modelo, marca, año, costoAdquisicion, precioRenta, kilometraje, estado, fechaRevision);
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
    public String determinarMantenimiento(){
        LocalDate hoy = LocalDate.now();
        if (kilometraje >= 8500 && fechaRevision.isBefore(hoy.minusYears(1))){
            return "Kilometraje: " + kilometraje + 
                    "\nUltima fecha de revision: " + fechaRevision +
                    "\nAVISO: Llevar el vehiculo a mantenimiento. Se recomienda su retiro temporal.";
        }
        return  "Kilometraje: " + kilometraje + 
                "\nUltima fecha de revision: " + fechaRevision +
                "\nAVISO: No es necesario llevar el vehiculo a mantenimiento";
    }
    
    // Metodos leer
    
    public void leerNombreChofer(){
        do{
            System.out.print("Ingresar el nombre del chofer del autobus: ");
            nombreChofer = entrada.nextLine();
            if (!validarNombreChofer()) System.out.println("ERROR. Ingresar un nombre valido");
        } while (!validarNombreChofer());
    }
    
    public void leerDestinoInicial(){
        System.out.print("Ingresar de donde sale el autobus: ");
        destinoInicial = entrada.nextLine();
    }
    
    public void leerDestinoFinal(){   
        System.out.print("Ingresar a donde llega el autobus: ");
        destinoFinal = entrada.nextLine();
    }
    
    public void leerTiempoRecorrido(){
        String numeroString = "";
        do{
            try{
                System.out.print("Ingresar el tiempo que dura el recorrido (en minutos): ");
                numeroString = entrada.nextLine();
                tiempoRecorrido = Integer.parseInt(numeroString);
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar un numero entero");
            } finally {
                if (tiempoRecorrido < 0) System.out.println("ERROR. Ingresar un numero mayor o igual 0");
            }
        } while (!validarNumeroEntero(numeroString));
    }
    
    public void leerGastoGasolina(){
        String numeroString = "";
        do{
            try{ 
                System.out.print("Ingresar gasolina gastada en el recorrido (en litros): ");
                numeroString = entrada.nextLine();
                gastoGasolina = Float.parseFloat(numeroString);
            } catch (NumberFormatException error){
                System.out.println("ERROR. Ingresar un numero entero o con decimales");
            } finally {
                if (gastoGasolina < 0) System.out.println("ERROR. Ingresar un numero mayor o igual a 0");
            }
        } while (!validarNumeroFlotante(numeroString));
    }
    
    public void leerSanitario(){
        String baño;
        do{
            System.out.print("Ingresar si el autobus tiene baño(s/n): ");
            baño = entrada.nextLine().toLowerCase();
            if (!"s".equals(baño) && !"n".equals(baño)){
                System.out.println("ERROR. Ingresar s o n");
            }
            else if ("n".equals(baño)){
                setSanitario(false);
            }
            else{
                setSanitario(true);
            }
        } while (!"s".equals(baño) && !"n".equals(baño));
    }
    
    // Metodos mostrar
    
    public String mostrarBaño(boolean bol){
        if (bol == false) return "NO";
        else return "SI";
    }
    
    @Override
    public String mostrarInformacion(){
        String baño = mostrarBaño(sanitario);
        return "Codigo del autobus: " + codigoVehiculo +
            "\nNumero de placa: " + numeroPlaca +
            "\nModel del autobus: " + modelo +
            "\nMarca del autobus: " + marca +
            "\nAño de fabricacion del autobus: " + año + 
            "\nCosto de adquisicion del autobus: " + costoAdquisicion + 
            "\nPrecio de renta: " + precioRenta + 
            "\nKilometraje acumulado: " + kilometraje +
            "\nEstado del autobus: " + estado +
            "\nFecha de la ultima revision del autobus: " + fechaRevision +
            "\nNombre del chofer: " + nombreChofer +
            "\nDestino inicial: " + destinoInicial +
            "\nDestino final: " + destinoFinal +
            "\nTiempo que dura el recorrido: " + tiempoRecorrido +
            "\nGasto de gasolina por viaje: " + gastoGasolina +
            "\nNombre del chofer: " + nombreChofer +
            "\nBaño: " + baño;
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
        leerNombreChofer();
        leerDestinoInicial();
        leerDestinoFinal();
        leerTiempoRecorrido();
        leerGastoGasolina();
        leerSanitario();
    }
    
}
