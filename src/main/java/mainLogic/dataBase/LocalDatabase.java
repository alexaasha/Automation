package mainLogic.dataBase;

import lombok.NonNull;
import outerClasses.Data;
import outerClasses.staff.Employee;

import java.util.ArrayList;
import java.util.List;

public class LocalDatabase extends DataBase{
    private static LocalDatabase localDatabase;
    private List<Employee> employees;

    private LocalDatabase(){
        employees = new ArrayList<>();
    }

    public static LocalDatabase getLocalDatabase() {
        if (localDatabase == null)
            localDatabase = new LocalDatabase();

        return localDatabase;
    }

    @Override
    public List<Employee> sendData() {
        return employees;
    }

    @Override
    public void setData(List<Employee> employees) {
        this.employees = employees;
    }
}
