import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting Employee information
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Monthly Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        double incomeTax = employee.calcTax();
        System.out.println("\nEmployee Information:");
        System.out.println(employee);
        System.out.printf("Income Tax: %.2f%n", incomeTax);

        // Accepting Product information
        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        double salesTax = product.calcTax();
        System.out.println("\nProduct Information:");
        System.out.println(product);
        System.out.printf("Sales Tax (per unit): %.2f%n", salesTax);

        scanner.close();
    }
}
