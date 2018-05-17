import management.Manager;

import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Hannah",000113,15.00);
    }


    @Test
    public void canGetName(){
        assertEquals("Hannah", databaseAdmin.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals(000113, databaseAdmin.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(15.00, databaseAdmin.getSalary(),.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.10);
        assertEquals(1.50, databaseAdmin.getRate(),.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.15, databaseAdmin.payBonus(),.00);
    }
}