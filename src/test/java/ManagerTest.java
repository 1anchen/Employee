import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
       manager = new Manager("Yang",000111,20.00,"IT");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("IT", manager.getDepName());
    }

    @Test
    public void canGetName(){
        assertEquals("Yang", manager.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals(000111, manager.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20.00, manager.getSalary(),.00);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.10);
        assertEquals(2.00, manager.getRate(),.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.20, manager.payBonus(),.00);
    }

    @Test
    public void canPreventNegativeValueReturnTrue(){
        assertEquals(true, manager.preventNegativeValue(0.20));
    }

    @Test
    public void canPreventNegativeValueReturnFalse(){
        assertEquals(false, manager.preventNegativeValue(-0.02));
    }


    @Test
    public void canSetName(){
        manager.setName("yang");
        assertEquals("yang",manager.getName());
    }

    @Test
    public void canSetNameInputEmptyString(){
        manager.setName(null);
        assertEquals("Yang",manager.getName());
    }


}
