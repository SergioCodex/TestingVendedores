/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavendedores;

/**
 *
 * @author root-admin
 */
public class Vendedor {

    //Atributos
    private int numvend;
    private String nomvend;
    private String nombrecomer;
    private String provincia;
    private String localidad;
    private String direccion;

    public Vendedor() {
        
    }

    public Vendedor(int numvend, String nomvend, String nombrecomer, String provincia, String localidad, String direccion) {
        this.numvend = numvend;
        this.nomvend = nomvend;
        this.nombrecomer = nombrecomer;
        this.provincia = provincia;
        this.localidad = localidad;
        this.direccion = direccion;
    }

    public int getNumvend() {
        return numvend;
    }

    public String getNomvend() {
        return nomvend;
    }

    public String getNombrecomer() {
        return nombrecomer;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNumvend(int numvend) {
        this.numvend = numvend;
    }

    public void setNomvend(String nomvend) {
        this.nomvend = nomvend;
    }

    public void setNombrecomer(String nombrecomer) {
        this.nombrecomer = nombrecomer;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
}
