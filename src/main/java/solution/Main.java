package solution;

import bandeau.Bandeau;
import solution.Clignote;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        TourComplet tc = new TourComplet();
        Clignote c = new Clignote();
        EffetCoul ef = new EffetCoul();
        Zoom z = new Zoom();
        CarParCar cp = new CarParCar();

        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        Scena scenario = new Scena(monBandeau);
        scenario.ajouterEffet(c, 10);
        scenario.ajouterEffet(ef, 2);
        scenario.ajouterEffet(z, 2);
        scenario.ajouterEffet(tc ,1);
        scenario.ajouterEffet(cp, 7);
        scenario.excecuter();


    }


}
