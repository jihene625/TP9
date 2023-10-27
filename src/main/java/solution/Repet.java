package solution;

public class Repet {

    private Effet effet;
    private int nbreRepet;

    public Repet(Effet e, int nbreRepet) {
        this.effet = e;
        this.nbreRepet = nbreRepet;
    }

    public int getNbreRepet() {
        return nbreRepet;
    }

    public Effet getEffet() {
        return effet;
    }
}