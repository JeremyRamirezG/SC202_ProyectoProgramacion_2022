package CRUD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

import sc202.proyectofinal_sistemadeventadeverduleria.Frutas;
import sc202.proyectofinal_sistemadeventadeverduleria.Verduras;
import sc202.proyectofinal_sistemadeventadeverduleria.Otros;

/**
 *
 * @author jrg71
 */
public class ManejoProductos {
    //Atributos de la clase
    private String rutaProductos;
    private String archivoProductos;
    private String idProductoManejoArchivos;
    private String tipoProducto;
    private Frutas objFrutas;
    private Otros objOtros;
    private Verduras objVerduras;
    
    //Constructores de la clase
    public ManejoProductos(String rutaProductos, String archivoProductos, String idProductoManejoArchivos, String tipoProducto, Frutas objFrutas, Otros objOtros, Verduras objVerduras) {
        this.rutaProductos = rutaProductos;
        this.archivoProductos = archivoProductos;
        this.idProductoManejoArchivos = idProductoManejoArchivos;
        this.tipoProducto = tipoProducto;
        this.objFrutas = objFrutas;
        this.objOtros = objOtros;
        this.objVerduras = objVerduras;
    }
    public ManejoProductos() {
        this.rutaProductos = "";
        this.archivoProductos = "Productos"+tipoProducto+".txt";
        this.idProductoManejoArchivos = "";
        this.tipoProducto = "";
        this.objFrutas = new Frutas();
        this.objOtros = new Otros();
        this.objVerduras = new Verduras();
    }
    
    //GETs & SETs
    public String getRutaProductos() {
        return rutaProductos;
    }

    public void setRutaProductos(String rutaProductos) {
        this.rutaProductos = rutaProductos;
    }

    public String getArchivoProductos() {
        return archivoProductos;
    }

    public void setArchivoProductos(String archivoProductos) {
        this.archivoProductos = archivoProductos;
    }

    public String getIdProductoManejoArchivos() {
        return idProductoManejoArchivos;
    }

    public void setIdProductoManejoArchivos(String idProductoManejoArchivos) {
        this.idProductoManejoArchivos = idProductoManejoArchivos;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Frutas getObjFrutas() {
        return objFrutas;
    }

    public void setObjFrutas(Frutas objFrutas) {
        this.objFrutas = objFrutas;
    }

    public Otros getObjOtros() {
        return objOtros;
    }

    public void setObjOtros(Otros objOtros) {
        this.objOtros = objOtros;
    }

    public Verduras getObjVerduras() {
        return objVerduras;
    }

    public void setObjVerduras(Verduras objVerduras) {
        this.objVerduras = objVerduras;
    }
    
}
