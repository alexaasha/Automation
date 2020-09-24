package mainLogic.controller;

import mainLogic.dataBase.LocalDatabase;
import mainLogic.server.Server;
import outerClasses.AcDepartment;
import outerClasses.hr.HREngineersDepartment;
import outerClasses.staff.Employee;

import java.util.List;

public class Controller {
    private final LocalDatabase localDatabase;
    private final Server server;

    public Controller(){
        localDatabase = LocalDatabase.getLocalDatabase();
        server = Server.getServer();
    }

    public void getDataForAcDepartment(List<Employee> employees){
        localDatabase.setData(employees);
        new HREngineersDepartment().sendData(employees);
        server.setEmployees(localDatabase.sendData());

        AcDepartment.printResults(server.sendData());
    }
}
