public class Robogo extends Jarmu implements KisGepjarmu {
    private int maximalisSebesseg;

    public Robogo(String rendszam, int aktualisSebesseg, int maximalisSebesseg) {
        super(rendszam, aktualisSebesseg);
        this.maximalisSebesseg = maximalisSebesseg;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if(this.aktualisSebesseg > sebessegkorlat) {
            return true;
        }
        return false;
    }

    @Override
    public boolean haladhatott(int sebesseg) {
        if(this.maximalisSebesseg > sebesseg) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }
}
