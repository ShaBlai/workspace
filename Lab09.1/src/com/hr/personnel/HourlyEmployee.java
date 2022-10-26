package com.hr.personnel;
import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    double rate;
    double hours;


    //constructor

    public HourlyEmployee(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super (name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }


    //business methods
    @Override
    public void pay(){

        System.out.println(getName() + " is paid Salary " + rate * hours);

    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString()+
                "rate=" + rate +
                ", hours=" + hours +
                " ";
    }

    @Override
    public void payTaxes() {
        double taxTotal = (getHours()* getRate()) * TaxPayer.HOURLY_TAX_RATE;
        System.out.println("The employee " + getName() + " has worked this many hours " + getHours() + " at this rate per hour $" + getRate() + " and paid this much taxes: $" + taxTotal);
    }
}
