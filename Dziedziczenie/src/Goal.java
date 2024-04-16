public class Goal {
    private String nazwa;
    private int[] data;
    private int wartosc;
    public Goal(int rok, int mies, int dzien, String nazwa, int wartosc){
        this.nazwa = nazwa;
        this.data = new int[]{rok,mies,dzien};
        this.wartosc = wartosc;
    }
    public int getWartosc() {
        return wartosc;
    }
}
