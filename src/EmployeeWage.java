public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program!");

        // UC-1
        System.out.println("Checking whether Employee is present or absent");
        int present = 1;
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if (employeeCheck == present)
            System.out.println("Employee is PRESENT");
        else
            System.out.println("Employee is ABSENT");
    }
}