package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    int empid;
    String empname;
    int salary;

    Employee(int empid,String empname,int salary)
    {
        this.empid=empid;
        this.empname=empname;
        this.salary=salary;
    }
}



public class MapFilterDemo4 {
    public static void main(String[] args) {

        //method 1

       /*List<Employee> employeesList=new ArrayList<Employee>();
		employeesList.add(new Employee(101,"Alex",10000));
		employeesList.add(new Employee(101,"Alex",10000));
		employeesList.add(new Employee(101,"Alex",10000));
		employeesList.add(new Employee(101,"Alex",10000));*/

        //method 2
        List<Employee> employeesList=Arrays.asList(
                new Employee(101,"Alex",10000),
                new Employee(102, "Brian", 20000),
                new Employee(103, "Charles", 30000),
                new Employee(104, "David", 40000),
                new Employee(105, "Edward", 50000)
        );

//        Combination of filter and map
        List<String> employeeListStream = employeesList.stream()
                .filter(employee -> employee.salary >= 30000)
                .map(employee -> employee.empname.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(employeeListStream);
    }



}
