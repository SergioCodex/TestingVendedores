/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavendedores;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author root-admin
 */
@RunWith(Parameterized.class)
public class TestParaBuscar {

    Vendedores vend = new Vendedores();

    //Vendedores
    static Vendedor v1;
    static Vendedor v3;
    
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        v1 = new Vendedor(1, "Sergio", "Eroski", "Alicante", "Elche", "Calle Falsa 123");
        v3 = new Vendedor(3, "Sara", "Vitalis", "Alicante", "Elche", "Calle otra 987");

        vend.Anaydir_Vendedor(v1);
        vend.Anaydir_Vendedor(v3);
        
    }

    @After
    public void tearDown() {

    }

    @Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{
            {"Alicante", 2}, {"Madrid", 0}
        });
    }

    //Atributos.
    private String busca;
    private int expected;

    public TestParaBuscar(String busca, int expected) {

        this.expected = expected;
        this.busca = busca;

    }

    //Tres existen (true), uno no existe (false).
    @Test
    public void testEliminar() {

        ArrayList<Vendedor> lista = vend.Buscar_Vendedor(busca);
        int result = lista.size();
        Assert.assertEquals(result, expected);
    }

}