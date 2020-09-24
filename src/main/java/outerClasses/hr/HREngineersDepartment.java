package outerClasses.hr;

import lombok.EqualsAndHashCode;
import lombok.Value;
import outerClasses.staff.Employee;
import outerClasses.staff.Engineer;

import java.util.Random;

@EqualsAndHashCode(callSuper = true)
public class HREngineersDepartment extends HRDepartment{
    public HREngineersDepartment(){
        poolOfNames = new String[] {"Alex", "John", "Sam", "Steven", "Donald",
                "Linus", "Bill", "Alan", "Martin", "Bryan", "Dennis", "Bjarne", "Guido"};
    }

    @Override
    public Employee createEmployee() {
        int nameId = new Random().nextInt(poolOfNames.length);
        return new Engineer(poolOfNames[nameId], new Random().nextLong() % MAX_EXP);
    }
}
