public interface Taxable {
    double SALES_TAX = 7.0; // 7%
    double INCOME_TAX = 10.5; // 10.5%
    
    double calcTax(); // Abstract method
}
