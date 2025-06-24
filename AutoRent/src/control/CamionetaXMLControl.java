/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Camioneta;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
public class CamionetaXMLControl {
    
    private final Element root;
    private final String fileLocation;

   public CamionetaXMLControl() throws JDOMException, IOException {
        this.fileLocation = "Other Sources/files/camioneta.xml"; 
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
    
    private Element CamionetatoXmlElement(Camioneta camioneta) {
        Element camionetaElement = new Element("Camioneta");
        camionetaElement.addContent(new Element("codigoVehiculo").setText(String.valueOf(camioneta.getCodigoVehiculo())));
        camionetaElement.addContent(new Element("numeroPlaca").setText(camioneta.getNumeroPlaca()));
        camionetaElement.addContent(new Element("modelo").setText(camioneta.getModelo()));
        camionetaElement.addContent(new Element("marca").setText(camioneta.getMarca()));
        camionetaElement.addContent(new Element("año").setText(String.valueOf(camioneta.getAño())));
        camionetaElement.addContent(new Element("costoAdquisicion").setText(String.valueOf(camioneta.getCostoAdquisicion())));
        camionetaElement.addContent(new Element("precioRenta").setText(String.valueOf(camioneta.getPrecioRenta())));
        camionetaElement.addContent(new Element("kilometraje").setText(String.valueOf(camioneta.getKilometraje())));
        camionetaElement.addContent(new Element("estado").setText(String.valueOf(camioneta.getEstado())));
        camionetaElement.addContent(new Element("fechaRevision").setText(String.valueOf(camioneta.getFechaRevision())));
        camionetaElement.addContent(new Element("numeroPasajeros").setText(String.valueOf(camioneta.getNumeroPasajeros())));
        camionetaElement.addContent(new Element("costoPasaje").setText(String.valueOf(camioneta.getCostoPasaje())));
        camionetaElement.addContent(new Element("numeroPuertas").setText(String.valueOf(camioneta.getNumeroPuertas())));
        return camionetaElement;
    }
    
    private Camioneta CamionetaToObject(Element element) throws ParseException {
        return new Camioneta(
                Integer.parseInt(element.getChildText("numeroPasajeros")),
                Float.parseFloat(element.getChildText("costoPasaje")),
                Integer.parseInt(element.getChildText("numeroPuertas")),
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
        List<Element> camionetas = this.root.getChildren("Camioneta");
        for (Element camionetaElement : camionetas) {
            if (codigoStr.equals(camionetaElement.getChildText("codigoVehiculo"))) {
                return camionetaElement; 
            }
        }
        return null; 
    }
    
    public boolean agregarCamioneta(Camioneta camioneta) {
        root.addContent(CamionetatoXmlElement(camioneta));
        return updateDocument();
    }
    
    public boolean actualizarCamioneta(Vehiculo camioneta) {
        Element elementoActualizar = buscarElementoPorCodigo(camioneta.getCodigoVehiculo());
        if (elementoActualizar != null) {
            Vehiculo vehi = (Vehiculo) camioneta;
            elementoActualizar.getChild(String.valueOf(vehi.getKilometraje()));
            elementoActualizar.getChild(String.valueOf(vehi.getFechaRevision()));
            elementoActualizar.getChild(vehi.getNumeroPlaca());
            elementoActualizar.getChild(String.valueOf((char) vehi.getEstado()));
            return updateDocument();
        }

        return false;
    }
    
    public ArrayList<Camioneta> todosLasCamionetas() {
        ArrayList<Camioneta> resultado = new ArrayList<>();
        List<Element> listaXml = root.getChildren("Camioneta");
        
        for (Element elemento : listaXml) {
            try {
                resultado.add(CamionetaToObject(elemento));
            } catch (ParseException | NumberFormatException e) {
                System.err.println("Se omitió una camioneta por datos corruptos en el XML: " + e.getMessage());
            }
        }
        return resultado;
    }
       
}
