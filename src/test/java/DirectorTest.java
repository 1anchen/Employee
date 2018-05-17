import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("John",000114,40.00,"Board",200.00);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Board", director.getDepName());
    }

    @Test
    public void canGetName(){
        assertEquals("John", director.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals(000114, director.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40.00, director.getSalary(),.00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.10);
        assertEquals(4.00, director.getRate(),.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.80, director.payBonus(),.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(200.00, director.getBudget(),.00);
    }
}