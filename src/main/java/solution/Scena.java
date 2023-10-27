package solution;

import bandeau.Bandeau;
import java.awt.*;
import java.util.ArrayList;

public class Scena {

    private ArrayList<Repet> lesEffets;
    private Bandeau bandeau;

    public Scena(Bandeau bandeau) {
        this.lesEffets = new ArrayList<>();
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effet e, int nbreRept) {
        Repet rp = new Repet(e, nbreRept);
        lesEffets.add(rp);
    }

    public void excecuter() {
        for (Repet rp : lesEffets) {
            for (int i = 0; i < rp.getNbreRepet(); i++) {
                rp.getEffet().excecuter(bandeau);
            }

        }
    }

}