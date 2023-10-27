package solution;

import bandeau.Bandeau;
import java.awt.*;

public class Clignote extends Effet {

    public void excecuter(Bandeau b) {
        b.setMessage("Clignote");
        b.sleep(100);
        b.setMessage("");
        b.sleep(100);

    }
}