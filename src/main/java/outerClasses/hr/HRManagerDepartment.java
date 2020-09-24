package outerClasses.hr;

import lombok.EqualsAndHashCode;
import mainLogic.dataBase.OuterDatabase;
import outerClasses.staff.Employee;
import outerClasses.staff.Manager;

import java.util.Random;

@EqualsAndHashCode(callSuper = true)
public class HRManagerDepartment extends HRDepartment {
    public HRManagerDepartment(){
        poolOfNames = new String[] {"Greg", "Amanda", "Boris", "Donald",
                "Bill", "Alan", "Martin", "Bryan", "Dennis", "Eugen"};
    }

    @Override
    public Employee createEmployee() {
        int nameId = new Random().nextInt(poolOfNames.length);
        return new Manager(poolOfNames[nameId], new Random().nextLong() % MAX_EXP);
    }
}
