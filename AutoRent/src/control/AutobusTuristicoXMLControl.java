/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.AutobusTuristico;
import model.Vehiculo;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author Freddy A. Fernández
 */
public class AutobusTuristicoXMLControl {
    
    private final Element root;
    private final String fileLocation;

   public AutobusTuristicoXMLControl() throws JDOMException, IOException {
        this.fileLocation = "Other Sources/files/autobusTuristico.XML"; 
        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(fileLocation);
            this.root = (Element) doc.getRootElement();
        } catch (JDOMException | IOException e) {
            System.err.println("Error al cargar o parsear el archivo XML: " + e.getMessage());
            throw e; 
        }
    }
   
    private boolean updateDocument() {
        try (FileOutputStream file = new FileOutputStream(fileLocation)) {
            XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
            out.output(root, file);
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo XML: " + e.getMessage());
            return false;
        }
    }
    
    private Element AutobustoXmlElement(AutobusTuristico autobus) {
        Element autobusElement = new Element("AutobusTuristico");
        autobusElement.addContent(new Element("codigoVehiculo").setText(String.valueOf(autobus.getCodigoVehiculo())));
        autobusElement.addContent(new Element("numeroPlaca").setText(autobus.getNumeroPlaca()));
        autobusElement.addContent(new Element("modelo").setText(autobus.getModelo()));
        autobusElement.addContent(new Element("marca").setText(autobus.getMarca()));
        autobusElement.addContent(new Element("año").setText(String.valueOf(autobus.getAño())));
        autobusElement.addContent(new Element("costoAdquisicion").setText(String.valueOf(autobus.getCostoAdquisicion())));
        autobusElement.addContent(new Element("precioRenta").setText(String.valueOf(autobus.getPrecioRenta())));
        autobusElement.addContent(new Element("kilometraje").setText(String.valueOf(autobus.getKilometraje())));
        autobusElement.addContent(new Element("estado").setText(String.valueOf(autobus.getEstado())));
        autobusElement.addContent(new Element("fechaRevision").setText(String.valueOf(autobus.getFechaRevision())));
        autobusElement.addContent(new Element("nombreChofer").setText(autobus.getNombreChofer()));
        autobusElement.addContent(new Element("destinoInicial").setText(autobus.getDestinoInicial()));
        autobusElement.addContent(new Element("destinoFinal").setText(autobus.getDestinoFinal()));
        autobusElement.addContent(new Element("tiempoRecorrido").setText(String.valueOf(autobus.getTiempoRecorrido())));
        autobusElement.addContent(new Element("sanitario").setText(String.valueOf(autobus.isSanitario())));
        autobusElement.addContent(new Element("gastoGasolina").setText(String.valueOf(autobus.getGastoGasolina())));
        return autobusElement;
    }
    
    private AutobusTuristico AutobusToObject(Element element) throws ParseException {
        return new AutobusTuristico(
                element.getChildText("nombreChofer"),
                element.getChildText("destinoInicial"),
                element.getChildText("destinoFinal"),
                Integer.parseInt(element.getChildText("tiempoRecorrido")),
                Boolean.parseBoolean(element.getChildText("costoPasaje")),
                Float.parseFloat(element.getChildText("gastoGasolina")),
                Integer.parseInt(element.getChildText("codigoVehiculo")),
                element.getChildText("numeroPlaca"),
                element.getChildText("modelo"),
                element.getChildText("marca"),
                Integer.parseInt(element.getChildText("año")),
                Float.parseFloat(element.getChildText("costoAdquisicion")),
                Float.parseFloat(element.getChildText("precioRenta")),
                Integer.parseInt(element.getChildText("kilometraje")),
                Integer.parseInt(element.getChildText("estado")),
                LocalDate.parse(element.getChildText("fechaRevision"))
        );
    }
    
    private Element buscarElementoPorCodigo(Integer codigo) {
        String codigoStr = Integer.toString(codigo);
        List<Element> autobuses = this.root.getChildren("AutobusTuristico");
        for (Element autobusElement : autobuses) {
            if (codigoStr.equals(autobusElement.getChildText("codigoVehiculo"))) {
                return autobusElement; 
            }
        }
        return null; 
    }
    
    public boolean agregarAutobus(AutobusTuristico autobus) {
        root.addContent(AutobustoXmlElement(autobus));
        return updateDocument();
    }
    
    public boolean actualizarAutobusTuristico(Vehiculo autobus) {
        Element elementoActualizar = buscarElementoPorCodigo(autobus.getCodigoVehiculo());
        if (elementoActualizar != null) {
            Vehiculo vehi = (Vehiculo) autobus;
            elementoActualizar.getChild(String.valueOf(vehi.getKilometraje()));
            elementoActualizar.getChild(String.valueOf(vehi.getFechaRevision()));
            elementoActualizar.getChild(vehi.getNumeroPlaca());
            elementoActualizar.getChild(String.valueOf((char) vehi.getEstado()));
            return updateDocument();
        }

        return false;
    }
    
    public ArrayList<AutobusTuristico> todosLosAutobuses() {
        ArrayList<AutobusTuristico> resultado = new ArrayList<>();
        List<Element> listaXml = root.getChildren("AutobusTuristico");
        
        for (Element elemento : listaXml) {
            try {
                resultado.add(AutobusToObject(elemento));
            } catch (ParseException | NumberFormatException e) {
                System.err.println("Se omitió un autobus por datos corruptos en el XML: " + e.getMessage());
            }
        }
        return resultado;
    }
    
    
}
