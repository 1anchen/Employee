import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
       developer = new Developer("Juan",000112,18.00);
    }


    @Test
    public void canGetName(){
        assertEquals("Juan", developer.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals(000112, developer.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(18.00, developer.getSalary(),.00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.10);
        assertEquals(1.80, developer.getRate(),.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.18, developer.payBonus(),.00);
    }
}
