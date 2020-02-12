/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 12-12S18038  Naomi Simatupang
 * @author 12-12S18047  Ulion Pardede
 */
public class MainTest {
    
    public MainTest() {
    }
    /*
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    */
    /**
     * Test of main method, of class Main.
     */
    
    @Test
    public void testMain() {
    
        }
    
    /**
     * Test of add method, of class Main.
     */
    @Test
    public void testAdd() {
        Main.reset();
       /* System.out.println("add");
        String _nim = "";
        String _name = "";
        Main.add(_nim, _name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
        Main.add("12S17067", "Fradina");
        assertEquals(1,Main.count());
        Main.add("12S18001", "Cindy");
        assertEquals(2,Main.count());
        Main.add("12S18002", "Wiranda");
        assertEquals(3,Main.count());
        Main.add("12S18003", "Citra");
        assertEquals(4, Main.count());
        Main.add("12S18004", "Rosalia");
        assertEquals(5, Main.count());
    }

    /**
     * Test of find method, of class Main.
     */
    @Test
    public void testFind() {
        /*
        System.out.println("find");
        String _nim = "";
        String expResult = "";
        String result = Main.find(_nim);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
        String result;
        Main.reset();
        Main.add("12S17067", "Fradina");
        Main.add("12S18001", "Cindy");
        Main.add("12S18002", "Wiranda");
        Main.add("12S18003", "Citra");
        Main.add("12S18004", "Rosalia");
 
        result = Main.find("12S17067");
        assertEquals("12S17067 Fradina", result);
        
        result = Main.find("12S18003");
        assertEquals("12S18003 Citra", result);
 
        result = Main.find("12S18006");
        assertEquals("", result);
        
    }

    /**
     * Test of count method, of class Main.
     */
    @Test
    public void testCount() {
       /* System.out.println("count");
        int expResult = 0;
        int result = Main.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    */
       Main.reset();
       Main.add("12S17067", "Fradina");
       Main.add("12S18001", "Cindy");
       Main.add("12S18002", "Wiranda");
       Main.add("12S18003", "Citra");
       Main.add("12S18004", "Rosalia");
       assertEquals(5, Main.count());
    }

    /**
     * Test of reset method, of class Main.
     */
    @Test
    public void testReset() {
    /*    System.out.println("reset");
        Main.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    */
    
    Main.reset();
    
    assertEquals(0, Main.count());
    Main.add("12S17067", "Fradina");
    Main.add("12S18001", "Cindy");
    Main.reset();
    assertEquals(0, Main.count());
    
    Main.add("12S18002", "Wiranda");
    Main.add("12S18003", "Citra");
    Main.add("12S18004", "Rosalia");
    Main.reset();
    assertEquals(0, Main.count());
    }
}
    

