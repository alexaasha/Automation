package outerClasses.staff;

import lombok.Getter;

import java.util.Date;
import java.util.Random;

@Getter
public abstract class Employee {
    private final String name;
    private final Long experience;
    private final Date enterTime;
    private final Date exitTime;
    protected String role;

    public Employee(String name, Long experience){
        this.name = name;
        this.experience = experience;

        enterTime = new Date(new Random().nextLong());
        exitTime = new Date(new Random().nextLong() + enterTime.getTime());
    }
}
