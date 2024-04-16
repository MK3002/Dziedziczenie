import java.util.ArrayList;

public class Developer extends Employee{
    ArrayList<Technology> technologies;
    public Developer(String imie, String nazwisko, String adres, String pesel, String email, int rokZatrudnienia) {
        super(imie, nazwisko, adres, pesel, email, rokZatrudnienia);
        this.technologies = new ArrayList<Technology>();
    }
    public void addTechnology(Technology technology){
        this.technologies.add(technology);
    }
    @Override
    public int calculateSalary() {
        int bonusFromTech = 0;
        for(Technology technology : technologies){
            bonusFromTech += technology.getWartosc();
        }
        return super.calculateSalary() + bonusFromTech;
    }
}
