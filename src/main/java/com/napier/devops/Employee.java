package com.napier.devops;

public class Employee {
        public int emp_no;
        public String first_name;
        public String last_name;

        // extra fields for the exercise
        public String title;     // current job title
        public int salary;       // current salary
        public String dept_name; // current department
        public String manager;   // current manager full name

        @Override
        public String toString() {
            return String.format(
                    "%d %s %s%n%s%nSalary: %d%n%s%nManager: %s%n",
                    emp_no, first_name, last_name,
                    title,
                    salary,
                    dept_name,
                    manager
            );
        }
    }
