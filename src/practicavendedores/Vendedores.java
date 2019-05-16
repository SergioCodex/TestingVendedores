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
public class Vendedores {

    ArrayList<Vendedor> vendedores;

    public Vendedores() {
        this.vendedores = new ArrayList<Vendedor>();
    }

    public boolean Anaydir_Vendedor(Vendedor v) {

        if (vendedores.add(v)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean Eliminar_Vendedor(int numvend) {

        Vendedor eliminar;

        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedores.get(i).getNumvend() == numvend) {
                eliminar = vendedores.get(i);

                if (vendedores.remove(eliminar)) {
                    return true;
                } else {
                    return false;
                }

            }

        }

        return false;
    }

    public Vendedor Buscar_Vendedor(int numvend) {

        Vendedor v = new Vendedor();

        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedores.get(i).getNumvend() == numvend) {
                v = vendedores.get(i);

                if (v != null) {
                    return v;
                }

            } else {
                return null;
            }
        }

        return null;

    }

    public ArrayList<Vendedor> Buscar_Vendedor(String provincia) {

        ArrayList<Vendedor> busqueda = new ArrayList<Vendedor>();

        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedores.get(i).getProvincia().equalsIgnoreCase(provincia)) {
                busqueda.add(vendedores.get(i));
            }
        }

        return busqueda;

    }

    public boolean Cargar_Datos(String provincia) {

        DB_Tabla_Vendedores tabla_vend = new DB_Tabla_Vendedores();

        ArrayList<Vendedor> busq = tabla_vend.Buscar_Vendedor(provincia);

        if (busq != null) {

            vendedores = busq;
            return true;

        }

        return false;

    }

}
