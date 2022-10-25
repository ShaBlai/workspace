package com.hr.personnel;
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



    @Override
    public String toString() {
        return super.toString()+
                "rate=" + rate +
                ", hours=" + hours +
                " ";
    }
}
