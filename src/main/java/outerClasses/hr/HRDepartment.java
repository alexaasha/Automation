package outerClasses.hr;

import mainLogic.dataBase.DataBase;
import mainLogic.dataBase.OuterDatabase;
import outerClasses.staff.Employee;

import java.util.List;

public abstract class HRDepartment {
    protected final static Long MAX_EXP = 30L;
    protected String[] poolOfNames;

    public abstract Employee createEmployee();

    public void sendData(List<Employee> employee){
        OuterDatabase outerDatabase = OuterDatabase.getOuterDatabase();
        outerDatabase.setData(employee);
    }
}
