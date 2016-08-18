/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoftgithub;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joao
 */
public class DivisaoTest {
    
    public DivisaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dividir method, of class Divisao.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int num1 = 4;
        int num2 = 2;
        Divisao instance = new Divisao();
        float expResult = 2.0F;
        float result = instance.dividir(num1, num2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dividirN1 method, of class Divisao.
     */
    @Test
    public void testDividirN1() {
        System.out.println("dividirN1");
        int num1 = 5;
        Divisao instance = new Divisao();
        float expResult = 1.0F;
        float result = instance.dividirN1(num1);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dividirN2 method, of class Divisao.
     */
    @Test
    public void testDividirN2() {
        System.out.println("dividirN2");
        int num2 = 3;
        Divisao instance = new Divisao();
        float expResult = 1.0F;
        float result = instance.dividirN2(num2);
        assertEquals(expResult, result, 0.0);
    }
    
}
