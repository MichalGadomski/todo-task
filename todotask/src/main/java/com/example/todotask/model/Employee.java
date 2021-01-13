package com.example.todotask.model;

import java.util.List;

/**
 * This interface offers methods to interact with an employee.
 */
public interface Employee {
    /**
     * Add a subordinate to a boss collection. The method fails if the boss cannot be found.
     * @param bossFirstName first name of boss
     * @param subordinate subordinate to be added to boss collection
     * @return employee with updated hierarchy
     */
    Employee addSubordinate(String bossFirstName, Employee subordinate);

    /**
     * Depending on a type of an employee (implementation), either just add the only one CEO,
     * or add many employees recursively.
     * @return list of all employees
     */
    List<Employee> addAllEmployeesToList();

    String getFirstName();
    void setFirstName(String firstName);

    int getAge();
    void setAge(int age);

    int getEmployeeId();
    void setEmployeeId(int employeeId);

    String getAddress();
    void setAddress(String address);

    int getReports();
    void setReports(int reports);

    String getBossFirstName();
    void setBossFirstName(String bossFirstName);
}
