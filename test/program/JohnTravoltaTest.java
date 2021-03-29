/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class JohnTravoltaTest {
    
    public JohnTravoltaTest() {
    }

    @Test
    public void cekGaji() {
        // TODO review the generated test code and remove the default call to fail.
        JohnTravolta instance=new JohnTravolta();
        double gaji=instance.hitung_gaji(52);
        assertEquals(870000.0, gaji, 0.0);
    }
       @Test
    public void cekNabung() {
        // TODO review the generated test code and remove the default call to fail.
        JohnTravolta instance=new JohnTravolta();
        instance.gaji=870000;
        int message =instance.nabung((int) 50000.0);
        assertEquals(1, message, 0);
    }
}
