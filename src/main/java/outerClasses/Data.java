package outerClasses;

import outerClasses.staff.Employee;

@lombok.Data
public class Data {
    private final Long lunchBreak;
    private final Long experience;
    private final Long surcharge;
    private final Employee employee;

    public Data(Long lunchBreak, Long experience, Long surcharge, Employee employee){
        this.lunchBreak = lunchBreak;
        this.experience = experience;
        this.surcharge = surcharge;
        this.employee = employee;
    }
}
