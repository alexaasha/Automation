import mainLogic.controller.Controller;
import outerClasses.hr.HREngineersDepartment;
import outerClasses.staff.Employee;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int numberOfEmp = 5;
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmp; i++){
            employees.add(new HREngineersDepartment().createEmployee());
        }

        Controller controller = new Controller();
        controller.getDataForAcDepartment(employees);
    }
}
