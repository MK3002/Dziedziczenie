import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Goal> goals;
    public Manager(String imie, String nazwisko, String adres, String pesel, String email, int rokZatrudnienia) {
        super(imie, nazwisko, adres, pesel, email, rokZatrudnienia);
        this.goals = new ArrayList<Goal>();
    }
    public void addGoals(Goal goal){
        goals.add(goal);
    }
    @Override
    public int calculateSalary() {
        int bonusFromGoals = 0;
        for(Goal goal : goals){
            bonusFromGoals += goal.getWartosc();
        }
        return super.calculateSalary() + bonusFromGoals;
    }
}
