package com.example.todotask.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a boss - an employee who has its subordinates.
 */
public class Boss extends GeneralEmployee {
    private List<Employee> subordinatesList;

    public Boss(String firstName, int age, int employeeId, String address, int reports, String bossFirstName) {
        super(firstName, age, employeeId, address, reports, bossFirstName);
        subordinatesList = new ArrayList<>();
    }

    @Override
    public Employee addSubordinate(String bossFirstName, Employee subordinate) {
        if (this.firstName.equals(bossFirstName)) {
            this.subordinatesList.add(subordinate);
            System.out.println("Subordinate "+subordinate.getFirstName()+" added to boss "+bossFirstName);
            return this;
        }

        // If above check failed, try to find a next node and try to find a match there.
        for (int i=0; i<this.subordinatesList.size(); i++) {
            // Check recursively (go once again into this addSubordinate method but from next employee's perspective).
            // It can go many levels deeper.
            this.subordinatesList.set(i, this.subordinatesList.get(i).addSubordinate(bossFirstName, subordinate));
        }

        // Return updated hierarchy.
        return this;
    }

    @Override
    public List<Employee> addAllEmployeesToList() {
        List<Employee> employeeList = new ArrayList<>();

        // Add this boss to the list.
        employeeList.add(this);

        // Iterate over all subordinates of this boss and in case of each, run this method recursively.
        // If any subordinate will be an instance of Subordinate class, it will use implementation of this
        // method from GeneralEmployee class.
        for (Employee e : subordinatesList) {
            employeeList.addAll(e.addAllEmployeesToList());
        }

        return employeeList;
    }
}
