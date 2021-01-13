package com.example.todotask.model;

import java.util.List;

/**
 * This interface offers methods to interact with a company.
 */
public interface Company {
    /**
     * Add an employee to a company with attributes and bossFirstName. The method fails if the boss cannot be found.
     * @param firstName first name of employee
     * @param age age of employee
     * @param employeeId id of employee
     * @param address simplified address of employee
     * @param reports amount of reports of employee
     * @param bossFirstName first name of employee's boss
     */
    void addEmployee(String firstName, int age, int employeeId, String address, int reports, String bossFirstName);

    /**
     * Returns an employee by given name.
     * @param firstName first name of employee
     * @return suitable employee
     */
    Employee getEmployee(String firstName);

    List<String> getAllEmployeesNames();
}
