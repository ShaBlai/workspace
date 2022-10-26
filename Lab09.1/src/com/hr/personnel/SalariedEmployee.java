package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double salary;



//constructor
    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    //busines methods

    @Override
    public void pay(){

        System.out.println(getName() + "is paid Salary" + getSalary());

       }





    //getters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary=" + getSalary() +
                ' ';
    }

    @Override
    public void payTaxes() {
        double taxTotal = getSalary() * TaxPayer.SALARIED_TAX_RATE;
        System.out.println("The employee " + getName()+ " has earned this much $" + getSalary() + " and pays this much in taxes: $" + taxTotal);

    }
}
