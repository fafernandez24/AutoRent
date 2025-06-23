/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutoRent;

import com.formdev.flatlaf.FlatLightLaf;
import control.AutobusTuristicoXMLControl;
import control.CamionetaXMLControl;
import static control.MainLibrary.leerListadoDeVehiculos;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.AutobusTuristico;
import model.Camioneta;
import model.Vehiculo;
import org.jdom.JDOMException;
import view.Menu;

/**
 * 
 *
 * @author Freddy
 */
public class Main {
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException, JDOMException, IOException{

        CamionetaXMLControl camionetaXML = new CamionetaXMLControl();
        ArrayList<Camioneta> listaCamioneta = camionetaXML.todosLasCamionetas();
        
        AutobusTuristicoXMLControl autobusXML = new AutobusTuristicoXMLControl();
        ArrayList<AutobusTuristico> listaAutobusTuristico = autobusXML.todosLosAutobuses();
       
        // Permite que la interfaz grafica se vea un poco mejor.
        UIManager.setLookAndFeel(new FlatLightLaf());
        
        ArrayList<Vehiculo> listaVehiculo = (ArrayList<Vehiculo>) leerListadoDeVehiculos(listaCamioneta, listaAutobusTuristico);

        
        Menu openStart = new Menu(listaVehiculo);
        openStart.setVisible(true);
    }
}