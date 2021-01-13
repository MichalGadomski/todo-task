package com.example.todotask.model;

/**
 * This class represents a typical worker - subordinate.
 */
public class Subordinate extends GeneralEmployee {
    public Subordinate(String firstName, int age, int employeeId, String address, int reports, String bossFirstName) {
        super(firstName, age, employeeId, address, reports, bossFirstName);
    }

    /**
     * Add a subordinate to a typical worker. It means that the typical worker changes its type to the boss.
     * At the beginning, when there is only a root employee (CEO), this method will be invoked to add a next employee.
     * @param bossFirstName first name of boss
     * @param subordinate subordinate to be added to boss collection
     * @return employee promoted and with updated hierarchy
     */
    @Override
    public Employee addSubordinate(String bossFirstName, Employee subordinate) {
        if (this.firstName.equals(bossFirstName)) {
            // Promote to the boss type.
            Boss promotedEmployee = new Boss(this.firstName, this.age, this.employeeId, this.address, this.reports, this.bossFirstName);
            // Use addSubordinate method from the Boss class.
            promotedEmployee.addSubordinate(bossFirstName, subordinate);
            // Return promoted employee with updated hierarchy (added new subordinate).
            return promotedEmployee;
        }
        return this;
    }
}
