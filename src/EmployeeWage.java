public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program!");

        // UC-1 and UC-2
        int isPresent = 1;
        int wagePerHr = 20;
        int empHrs, empWage;
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if(employeeCheck == isPresent){
            System.out.println("Employee is PRESENT");
            empHrs = 8;
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