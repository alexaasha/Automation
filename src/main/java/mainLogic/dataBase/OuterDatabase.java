package mainLogic.dataBase;

import outerClasses.staff.Employee;

import java.util.ArrayList;
import java.util.List;

public class OuterDatabase extends DataBase{
    private static OuterDatabase outerDatabase;
    private List<Employee> employees;

    private OuterDatabase(){
        employees = new ArrayList<>();
    }

    public static OuterDatabase getOuterDatabase() {
        if (outerDatabase == null)
            outerDatabase = new OuterDatabase();

        return outerDatabase;
    }

    @Override
    public List<Employee> sendData() {
        return employees;
    }

    @Override
    public void setData(List<Employee> employees) {
        if (employees.size() == 0)
            throw new IllegalArgumentException("Wrong size of updated data");

        this.employees = employees;
    }
}
