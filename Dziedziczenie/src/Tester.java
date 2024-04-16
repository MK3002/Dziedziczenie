import java.util.ArrayList;

public class Tester extends Employee{
    private ArrayList<String> tests;
    public Tester(String imie, String nazwisko, String adres, String pesel, String email, int rokZatrudnienia) {
        super(imie, nazwisko, adres, pesel, email, rokZatrudnienia);
        this.tests = new ArrayList<String>();
    }
    public void addTestType(String test){
        this.tests.add(test);
    }
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + tests.size()*300;
    }
}
