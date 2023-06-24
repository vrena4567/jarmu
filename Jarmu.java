public abstract class Jarmu {
    private String rendszam;
    protected int aktualisSebesseg;

    public Jarmu(String rendszam, int aktualisSebesseg) {
        this.rendszam = rendszam;
        this.aktualisSebesseg = aktualisSebesseg;
    }

    public abstract boolean gyorshajtottE(int sebessegkorlat);

    @Override
    public String toString() {
        return rendszam + " - " + aktualisSebesseg + " km/h";
    }
}
