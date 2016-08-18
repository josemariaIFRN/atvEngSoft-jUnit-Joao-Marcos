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
public class SubtracaoTest {
    
    public SubtracaoTest() {
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
     * Test of subtrair method, of class Subtracao.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int num1 = 5;
        int num2 = 3;
        Subtracao instance = new Subtracao();
        int expResult = 2;
        int result = instance.subtrair(num1, num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtrairN1 method, of class Subtracao.
     */
    @Test
    public void testSubtrairN1() {
        System.out.println("subtrairN1");
        int num1 = 4;
        Subtracao instance = new Subtracao();
        int expResult = 0;
        int result = instance.subtrairN1(num1);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtrairN2 method, of class Subtracao.
     */
    @Test
    public void testSubtrairN2() {
        System.out.println("subtrairN2");
        int num2 = 23;
        Subtracao instance = new Subtracao();
        float expResult = 0.0F;
        float result = instance.subtrairN2(num2);
        assertEquals(expResult, result, 0.0);
    }
    
}
