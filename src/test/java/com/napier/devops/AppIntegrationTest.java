package com.napier.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppIntegrationTest{

    static App app;

    @BeforeEach
    void setUp() {
        app = new App();
        app.connect("localhost:33060", 10000);
    }

    @Test
    void testGetEmployee() {
        Employee emp = app.getEmployee(255530);
        assertEquals(255530, emp.emp_no);
        assertEquals("Ronghao", emp.first_name);
        assertEquals("Garigliano", emp.last_name);
    }

    @Test
    void testAddEmployee() {
        Employee emp = new Employee();
        emp.emp_no = 500000;
        emp.first_name = "Lu Min";
        emp.last_name = "Aung";
        app.addEmployee(emp);
        emp = app.getEmployee(500000);
        assertEquals(emp.emp_no, 500000);
        assertEquals(emp.first_name, "Lu Min");
        assertEquals(emp.last_name, "Aung");
    }
}