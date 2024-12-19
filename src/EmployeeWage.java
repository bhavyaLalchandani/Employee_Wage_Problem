import java.util.HashMap;
import java.util.Map;

public class EmployeeWage {
    private static Map<String, Integer> companyWages = new HashMap<>();

    public static void computeWageForCompany(String companyName, int wagePerHr, int workingDaysPerMonth, int maxWorkingHrs) {
        int empHrs = 0, totalWage = 0, totalWorkingDays = 0, totalEmployeeHrs = 0;

        while (totalEmployeeHrs <= maxWorkingHrs && totalWorkingDays < workingDaysPerMonth) {
            totalWorkingDays++;
            int employeeType = (int) Math.floor(Math.random() * 10) % 3;

            switch (employeeType) {
                case 1 -> empHrs = 8; // Full-time
                case 2 -> empHrs = 4; // Part-time
                default -> empHrs = 0; // Absent
            }

            totalEmployeeHrs += empHrs;
            totalWage += empHrs * wagePerHr;
        }

        companyWages.put(companyName, totalWage);
        System.out.println("Total Wage for " + companyName + "'s Employee is: " + totalWage);
    }

    public static void displayAllWages() {
        System.out.println("Company Wages: " + companyWages);
    }

    public static void main(String[] args) {
        computeWageForCompany("CompanyA", 20, 20, 100);
        computeWageForCompany("CompanyB", 20, 20, 100);
        displayAllWages();
    }
}