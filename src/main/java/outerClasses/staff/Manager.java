package outerClasses.staff;

public class Manager extends Employee{
    public Manager(String name, Long experience) {
        super(name, experience);
        role = "manager";
    }
}
