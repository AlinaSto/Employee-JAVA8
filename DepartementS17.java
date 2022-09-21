package Exercises.Employeesesiunea17;

import java.util.List;

public class DepartementS17 {
    private String name;
    private String code;
    private List<EmployeeS17> employeeList;

    public DepartementS17(String name, String code, List<EmployeeS17> employeeList) {
        this.name = name;
        this.code = code;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<EmployeeS17> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeS17> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "DepartementS17{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
