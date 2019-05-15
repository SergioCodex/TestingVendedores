/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavendedores;

import java.util.ArrayList;

/**
 *
 * @author root-admin
 */
public class DB_Tabla_Vendedores {

    //Atributos
    private String conexion;

    public DB_Tabla_Vendedores(String conexion) {
        this.conexion = conexion;
    }

    public DB_Tabla_Vendedores(){
        
    }
    
    public boolean Anaydir_Vendedor(Vendedor v) {

        return true;
    }

    public boolean Modificar_Vendedor(int numvend, ArrayList[] datos) {

        return true;
    }

    public boolean Borrar_Vendedor(int numvend) {

        return true;
    }

    public ArrayList<Vendedor> Buscar_Vendedor(String provincia) {

        ArrayList<Vendedor> busqueda = new ArrayList<Vendedor>();

        return busqueda;

    }

    public void Desconectar() {
        this.conexion = "desconectado";
    }

}
