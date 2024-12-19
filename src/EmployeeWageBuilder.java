import java.util.ArrayList;
import java.util.List;

class EmployeeWageBuilder {
    private List<Company> companies;

    public EmployeeWageBuilder() {
        companies = new ArrayList<>();
    }

    public void addCompany(String name, int wagePerHr, int workingDaysPerMonth, int maxWorkingHrs) {
        companies.add(new Company(name, wagePerHr, workingDaysPerMonth, maxWorkingHrs));
    }

    public void computeWages() {
        for (Company company : companies) {
            int totalWage = computeWageForCompany(company);
            company.totalWage = totalWage;
            System.out.println("Total Wage for " + company.name + " is: " + totalWage);
        }
    }

    private int computeWageForCompany(Company company) {
        int empHrs = 0, totalWage = 0, totalWorkingDays = 0, totalEmployeeHrs = 0;

        while (totalEmployeeHrs <= company.maxWorkingHrs && totalWorkingDays < company.workingDaysPerMonth) {
            totalWorkingDays++;
            int employeeType = (int) Math.floor(Math.random() * 10) % 3;

            switch (employeeType) {
                case 1 -> empHrs = 8; // Full-time
                case 2 -> empHrs = 4; // Part-time
                default -> empHrs = 0; // Absent
            }

            totalEmployeeHrs += empHrs;
            totalWage += empHrs * company.wagePerHr;
        }

        return totalWage;
    }
}