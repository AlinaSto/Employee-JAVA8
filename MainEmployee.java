package Exercises.Employeesesiunea17;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        List<EmployeeS17> employeeS17List1 = new ArrayList<>();
        employeeS17List1.add(new EmployeeS17("John", 29000));
        employeeS17List1.add(new EmployeeS17("Ann", 145000));

        List<EmployeeS17> employeeS17List2 = new ArrayList<>();
        employeeS17List2.add(new EmployeeS17("Jill", 4000));
        employeeS17List2.add(new EmployeeS17("Ben", 35000));
        List<DepartementS17> departementS17List = new ArrayList<>();

        departementS17List.add(new DepartementS17("Production", "B5875", employeeS17List1));
        departementS17List.add(new DepartementS17("IT", "I45726", employeeS17List2));
        System.out.println(getHowManyEmployeesHasSalaryBiggestThanMinimum(departementS17List, employeeS17List1, employeeS17List2, 100000));
    }

    public static long getHowManyEmployeesHasSalaryBiggestThanMinimum(List<DepartementS17> departementS17List, List<EmployeeS17> employeeS17List, List<EmployeeS17> employeeS17List2, int minimumSalary) {
        //       int noOfEmploees = 0;
//        for (DepartementS17 departementS17 : departementS17List) {
//            for (EmployeeS17 employeeS17 : departementS17.getEmployeeList()) {
//                if (minimumSalary < employeeS17.getSalary()) {
//                    noOfEmploees++;
//                }
//            }
//        }
//        return noOfEmploees;
      return   departementS17List.stream()
                .flatMap(departementS17 -> departementS17.getEmployeeList().stream()) //pentru fiecare angajat, returnez un stream cu listade angajati
                .filter(employeeS17 -> employeeS17.getSalary() > minimumSalary)//filtram angajatii dupa o conditie folosind un predicat (ret. boolean)
                .count();


    }


}
