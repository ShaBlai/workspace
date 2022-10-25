package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double salary;


    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "SalariedEmployee " +
                "name=" + this.getName() +
                "hire Date=" + this.getHireDate() +
                "salary=" + salary +
                ' ';
    }
}
