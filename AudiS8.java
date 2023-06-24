public class AudiS8 extends Jarmu {

    private boolean lezerBlokkolo;

    public AudiS8(String rendszam, int aktualisSebesseg, boolean lezerBlokkolo) {
        super(rendszam, aktualisSebesseg);
        this.lezerBlokkolo = lezerBlokkolo;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if(this.aktualisSebesseg > sebessegkorlat && !this.lezerBlokkolo) {
            return true;
        }
        return false;
    }
    public String toSting() {
        return "Audi: " + super.toString();
    }
}
