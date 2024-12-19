public class EmployeeWage {
    public static void main(String[] args) {
        EmployeeWageBuilder builder = new EmployeeWageBuilder();
        builder.addCompany("CompanyA", 20, 20, 100);
        builder.addCompany("CompanyB", 25, 22, 120);
        builder.computeWages();
    }
}