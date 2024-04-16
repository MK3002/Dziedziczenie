public abstract class Employee {
    private String imie;
    private String nazwisko;
    private String adres;
    private String pesel;
    private String email;
    private int rokZatrudnienia;
    public Employee(String imie, String nazwisko, String adres, String pesel, String email, int rokZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.pesel = pesel;
        this.email = email;
        this.rokZatrudnienia = rokZatrudnienia;
    }
    public int calculateSalary() {
        return 3000 + (2024-rokZatrudnienia)*1000;
    }
}
