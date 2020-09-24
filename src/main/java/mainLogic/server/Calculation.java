package mainLogic.server;

import outerClasses.Data;
import outerClasses.staff.Employee;

import java.util.List;

public abstract class Calculation {
    protected abstract void calculation();

    protected abstract Long calculateSurcharge(Employee employee);
    protected abstract Long calculateExperience(Employee employee);
    protected abstract Long calculateLunchBreak(Employee employee);
}
