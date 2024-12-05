public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program!");

        // UC-1 UC-2 and UC-3
        int isFullTime = 1;
        int isPartTime = 2;
        int wagePerHr = 20;

        int empHrs, empWage;

        //RANDOM for attendance check
        double employeeCheck = Math.floor(Math.random() * 10) % 3;

        if(employeeCheck == isFullTime) {
            System.out.println("Employee is doing FULL-TIME");
            empHrs = 8;
        }
        else if(employeeCheck == isPartTime) {
            System.out.println("Employee is doing PART-TIME");
            empHrs = 4;
        }
        else {
            System.out.println("Employee is ABSENT");
            empHrs = 0;
        }
        empWage = empHrs * wagePerHr;
        System.out.println("Employee's Hours are: " + empHrs);
        System.out.println("Employee's Wage is: " + empWage);
    }
}