package mainLogic.dataBase;

import outerClasses.Data;
import outerClasses.staff.Employee;

import java.util.List;

public abstract class DataBase {
    public abstract List<Employee> sendData();
    public abstract void setData(List<Employee> employees);
}
