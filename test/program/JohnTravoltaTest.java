/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Asus
 */
public class JohnTravoltaTest {
    
    private int jam_kerja = 52;
    private double expResultGaji = 870000.0;
    private int pengeluaran = 500;
    private String expMessage = "John Butuh Cari Uang!";

    @Test
    public void testHitung_gaji() {
        System.out.println("Fungsi Hitung Gaji");
        JohnTravolta instance = new JohnTravolta();
        double result = instance.hitung_gaji(jam_kerja);
        assertEquals(expResultGaji, result, 0.0);
    }

    @Test
    public void testNabung() {
        System.out.println("Fungsi Menabung");
        JohnTravolta instance = new JohnTravolta();
        String result = instance.nabung((int)expResultGaji, pengeluaran);
        assertEquals(expMessage, result);
    }
}
