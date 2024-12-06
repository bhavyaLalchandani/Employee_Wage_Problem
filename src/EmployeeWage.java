public class EmployeeWage {
    private  static final int isFullTime = 1;
    private  static final int isPartTime = 2;
    private  static final int wagePerHr = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program!");
        int empHrs, empWage;
        //RANDOM for type check
        int employeeType = (int) Math.floor(Math.random() * 10) % 3;

        // UC-4
        switch (employeeType) {
            // UC-1 UC-2 and UC-3
            case isFullTime:
                System.out.println("Employee is doing FULL-TIME");
                empHrs = 8;
                break;
            case isPartTime:
                System.out.println("Employee is doing PART-TIME");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is ABSENT");
                empHrs = 0;
                break;
        }
        empWage = empHrs * wagePerHr;
        System.out.println("Employee's Hours are: " + empHrs);
        System.out.println("Employee's Wage is: " + empWage);
    }
}