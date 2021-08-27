import java.util.Scanner;

public class DemoPayroll {

    public static void main(String [] args) {

        //create input object
        Scanner inputScan = new Scanner (System.in);

        //declare variables
        String firstName, lastName;
        double hoursWorked, baseWage, pay;

        //input
        System.out.println("Enter Your First Name: ");
        firstName = inputScan.next();

        System.out.println("Enter Your Last Name: " );
        lastName = inputScan.next();

        System.out.println("Enter Hours Worked: ");
        hoursWorked = inputScan.nextDouble();

        System.out.println("Enter Base Wage: ");
        baseWage = inputScan.nextDouble();

        //calculate
        pay = hoursWorked * baseWage;

        //print
        System.out.println(  firstName + " " + lastName + " " +
                            "Weekly Payroll Report \n" +
                            "Hours Worked: " + hoursWorked + "\n" +
                            "Based Wage: $" + baseWage + "\n" +
                            "Weekly Pay Before Tax: $" + pay
        );



    }
}
