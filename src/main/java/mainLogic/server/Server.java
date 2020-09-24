package mainLogic.server;

import mainLogic.dataBase.DataBase;
import mainLogic.dataBase.OuterDatabase;
import outerClasses.Data;
import outerClasses.staff.Employee;

import java.util.LinkedList;
import java.util.List;

public class Server extends Calculation{
    private final DataBase outerDB;
    private static Server server;
    private List<Employee> employees;
    private final List<Data> listOfData;

    private final static Long MAX_WORKING_TIME = 12345567L;
    private final static Long CONST_SURCHARGE = 34567L;

    private Server(){
        outerDB = OuterDatabase.getOuterDatabase();
        listOfData = new LinkedList<>();
    }

    public static Server getServer(){
        if (server == null)
            server = new Server();

        return server;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Data> sendData(){
        calculation();
        return listOfData;
    }

    @Override
    protected final void calculation(){
        var newData = outerDB.sendData();
        if (!employees.equals(newData) && newData.size() != 0)
            employees = newData;

        for (var employee : employees){
            var surcharge = calculateSurcharge(employee);
            var experience = calculateExperience(employee);
            var lunchBreak = calculateLunchBreak(employee);

            listOfData.add(new Data(lunchBreak, experience, surcharge, employee));
        }
    }

    @Override
    protected final Long calculateSurcharge(Employee employee) {
        long workingTime = employee.getExitTime().getTime() - employee.getEnterTime().getTime();

        if (workingTime > MAX_WORKING_TIME)
            return CONST_SURCHARGE;
        else
            return 0L;
    }

    @Override
    protected final Long calculateExperience(Employee employee) {
        return employee.getExperience() +
                (employee.getExitTime().getTime() - employee.getEnterTime().getTime());
    }

    @Override
    protected final Long calculateLunchBreak(Employee employee) {
        return employee.getEnterTime().getTime()
                + (employee.getExitTime().getTime() - employee.getEnterTime().getTime()) / 2
                + 123L;
    }
}
