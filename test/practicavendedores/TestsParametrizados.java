/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavendedores;

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
public class TestsParametrizados {

    Vendedores vend = new Vendedores();

    //Vendedores
    static Vendedor v1;
    static Vendedor v2;
    static Vendedor v3;
    static Vendedor v4;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        v1 = new Vendedor(1, "Sergio", "Eroski", "Alicante", "Elche", "Calle Falsa 123");
        v2 = new Vendedor(2, "Jose", "Primark", "Murcia", "Murcia", "Calle Murcia 321");
        v3 = new Vendedor(3, "Sara", "Vitalis", "Alicante", "Elche", "Calle otra 987");
        v4 = new Vendedor(4, "Lluis", "Everis", "Alicante", "Elche", "Calle info 444");

        vend.Anaydir_Vendedor(v1);
        vend.Anaydir_Vendedor(v2);
        vend.Anaydir_Vendedor(v3);

    }

    @After
    public void tearDown() {

    }

    @Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{
            {1, true}, {2, true}, {3, true}, {4, false}
        });
    }

    //Atributos.
    private int elimina;
    private boolean expected;

    public TestsParametrizados(int elimina, boolean expected) {

        this.expected = expected;
        this.elimina = elimina;

    }

    //Tres existen (true), uno no existe (false).
    @Test
    public void testEliminar() {

        boolean result = vend.Eliminar_Vendedor(elimina);
        Assert.assertEquals(result, expected);
    }

}
