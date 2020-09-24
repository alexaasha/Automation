package outerClasses.staff;

public class Engineer extends Employee{
    public Engineer(String name, Long experience) {
        super(name, experience);
        role = "engineer";
    }
}
