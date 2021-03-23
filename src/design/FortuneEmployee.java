package design;

public class FortuneEmployee {

    /**
     FortuneEmployee class has a main method where you will be able to create Object from
        EmployeeInfo class to use fields and attributes
     <p>
     Demonstrate as many methods as possible to use with proper business work flow.
        Try to think like a Software Architect/Developer.
        This application should provide basic employee information services
     </p>
     <p>
     Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     </p>
     **/
    public static void main(String[] args) {
        EmployeeInfo employeeInfoConstructor1 = new EmployeeInfo(24);
        EmployeeInfo employeeInfoConstructor2 = new EmployeeInfo(1);
        EmployeeInfo employeeInfoConstructor3 = new EmployeeInfo("Ahmed",2);

        EmployeeInfo employeeInfo = new EmployeeInfo("ahmed",2);

        employeeInfo.sickTime();



        EmployeeInfo.setCompanyName("Timberland");
        System.out.println(EmployeeInfo.getCompanyName());

        EmployeeInfo.calculateEmployeeBonus(4);
        EmployeeInfo.calculateEmployeePension();


    }

}
