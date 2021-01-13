<b>Company Java application</b><br/>

<p>This is the program developed mainly to demonstrate functionality of:<br/>
  
- adding employee to a company;<br/>
- returning employee from a company by given name for reading and writing.</p>

<b>Assumptions</b><br/>

<p>Please remember that this program is a simplified version of a proper software, is developed only for demonstration purposes and should not be used comercially. Assumptions:</br>

- employeeId contains only numbers;<br/>
- address is stored in just one String but should be divided, for example: street, house number, apartment number, postcode, city;<br/>
- each employee has only firstName but it should be divided, for example: nameA, nameB, surname;<br/>
- there are two types of employees: Subordinate and Boss;
- a company must have a CEO, so during initialization, such CEO is added as a root;
- getEmployee method should not find people by firstName because many people in a company can have identical firstName (recommendation: by employeeId).</p>

<b>Build manual</b>

<p>Steps to compile and run this Java application (example based on Android Studio):<br/>
  
1. Clone this repository.
2. In project view you should see module "todotask" which contains all needed classes.
3. In navigation bar click "Add Configuration".
4. Click "+" icon to "Add New Configuration".
5. Select "Application" type.
6. Fill "Name" with "application".
7. Fill "Main class" with "com.example.todotask.Main".
8. Adjust working directory to match your needs.
9. Fill "Use classpath of module" with "TodoTask.todotask".
10. Run.<br/>
Remark: You can also run tests. To do this, go to TestClass (package com.example.todotask.test) and run them.
