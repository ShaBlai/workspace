public class Employee {

    private String name = "Shawn";
    private double salary = 192.00;
    private String address = "Van down by the river";



    public String getEmployeeName() {

    }


    public Employee(String name, double salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
