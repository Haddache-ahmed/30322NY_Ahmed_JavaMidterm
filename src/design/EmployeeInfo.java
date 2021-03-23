package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractClass implements Employee {

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     *
     */

    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    static String companyName;
    private int employeeId;
    private String name;
    static  int salary = 10000;
    static int performance;
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }


    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(int employeeId) {
        this.employeeId=employeeId;

    }

    public EmployeeInfo(String name, int employeeId) {
        this.name=name;
        this.employeeId=employeeId;

    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     *
     */
    public static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
        double total=0;
        double bonus;

        if(performance >= 8){
            bonus = salary * .1;
            System.out.println("Employees bonus best performance = $"+bonus);

            if (numberOfYearsWithCompany >= 5){
                total = salary + bonus;
            }
            System.out.println("total with best performance is: "+total);

        }else{
            bonus = salary*.08;
            System.out.println("Employees bonus average performance = $"+bonus);}

        if (numberOfYearsWithCompany < 5){
            total = salary + bonus;
        }
        System.out.println(" total with average performance is: "+total);

        return (int) total;
    }



    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public static int calculateEmployeePension() {
        int total = 0;
        double totalPension ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension
        int StartingDate=2017;
        int CurrentDate=2019;
        if (CurrentDate-StartingDate==1){
            totalPension = salary * .05;


        }else if (CurrentDate - StartingDate >= 2 ){
            totalPension = salary * .1;

        }else totalPension =0;


        System.out.println("this is pension total salary"+totalPension);
        return total;
    }



    private static class DateConversion {


        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
