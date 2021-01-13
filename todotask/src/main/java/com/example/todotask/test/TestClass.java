package com.example.todotask.test;

import com.example.todotask.Main;
import com.example.todotask.model.Employee;
import com.example.todotask.model.Subordinate;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestClass {
    @Test
    public void testAllEmployeesNames() {
        Main.main(new String[] {});
        List<String> result = Main.bestCompany.getAllEmployeesNames();
        String expected = "[John, Mary, Sam, Will, Jackie, Frank, Peter, Michael]";
        assertEquals(result.toString(), expected);
    }

    @Test
    public void testEmployeeGetter() {
        Main.main(new String[] {});
        Employee result = Main.bestCompany.getEmployee("Jackie");
        Employee expected = new Subordinate("Jackie", 70, 7, "Pomorska", 20, "Will");
        assertEquals(result, expected);
    }
}
