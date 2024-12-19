public class EmployeeWage {
    // private  static final int isFullTime = 1;
    // private  static final int isPartTime = 2;
    // private  static final int wagePerHr = 20;
    // private  static final int workingDaysPerMonth = 20;
    // private  static final int totalWorkingHrs = 100;

    // UC-8 Refactored the code to handle multiple companies using parameters for wagePerHr, workingDaysPerMonth, and maxWorkingHrs.
    public static void computeWageForCompany(String companyName, int wagePerHr, int workingDaysPerMonth, int maxWorkingHrs) {
        int empHrs = 0, totalWage = 0, totalWorkingDays = 0, totalEmployeeHrs = 0;

        while (totalEmployeeHrs <= maxWorkingHrs && totalWorkingDays < workingDaysPerMonth) {
            totalWorkingDays++;
            int employeeType = (int) Math.floor(Math.random() * 10) % 3;

            switch (employeeType) {
                case 1 -> { // Full-time
                    empHrs = 8;
                }
                case 2 -> { // Part-time
                    empHrs = 4;
                }
                default -> empHrs = 0; // Absent
            }

            totalEmployeeHrs += empHrs;
            int dailyWage = empHrs * wagePerHr;
            totalWage += dailyWage;
            System.out.println("The Employee's Current Total Working Days are: " + totalWorkingDays);
            System.out.println("The Employee's Current Total Working Hours are: " + totalEmployeeHrs);
        }
        System.out.println("Total Wage for " + companyName + "'s Employee is: " + totalWage);
    }

    public static void main(String[] args) {
        computeWageForCompany("CompanyA", 20, 20, 100);
        computeWageForCompany("CompanyB", 25, 20, 100);
    }
}