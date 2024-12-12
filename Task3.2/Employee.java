public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary; // Monthly salary

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        double yearlySalary = salary * 12;
        return yearlySalary * (INCOME_TAX / 100);
    }

    @Override
    public String toString() {
        return "Employee{" +
               "empId=" + empId +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }
}
