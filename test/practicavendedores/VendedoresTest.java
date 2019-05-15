/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavendedores;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author root-admin
 */
public class VendedoresTest {
    
    Vendedores vend = new Vendedores();
    Vendedor vendedor1;
    
    public VendedoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

        vendedor1 = new Vendedor();
        vendedor1.setNumvend(1);
        vend.Anaydir_Vendedor(vendedor1);

    }

    @After
    public void tearDown() {

    }

    /**
     * Test of Anaydir_Vendedor method, of class Vendedores.
     */
    @Test
    public void testAnaydir_Vendedor() {
        System.out.println("Anaydir_Vendedor");
        Vendedor v = new Vendedor();
        // Vendedores instance = new Vendedores();
        boolean expResult = true;
        boolean result = vend.Anaydir_Vendedor(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar_Vendedor method, of class Vendedores.
     */
//    @Test
//    public void testEliminar_Vendedor() {
//        System.out.println("Eliminar_Vendedor");
//        int numvend = 0;
//        Vendedores instance = new Vendedores();
//        boolean expResult = false;
//        boolean result = instance.Eliminar_Vendedor(numvend);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of Buscar_Vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_Vendedor_int() {
        System.out.println("Buscar_Vendedor");
        int numvend = 1;
        Vendedor vendresult = vendedor1;
        // Vendedores instance = new Vendedores();
        Vendedor expResult = vendresult;
        Vendedor result = vend.Buscar_Vendedor(numvend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar_Vendedor method, of class Vendedores.
     */
//    @Test
//    public void testBuscar_Vendedor_String() {
//        System.out.println("Buscar_Vendedor");
//        String provincia = "";
//        Vendedores instance = new Vendedores();
//        ArrayList<Vendedor> expResult = null;
//        ArrayList<Vendedor> result = instance.Buscar_Vendedor(provincia);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of Cargar_Datos method, of class Vendedores.
     */
//    @Test
//    public void testCargar_Datos() {
//        System.out.println("Cargar_Datos");
//        String provincia = "";
//        Vendedores instance = new Vendedores();
//        boolean expResult = false;
//        boolean result = instance.Cargar_Datos(provincia);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
