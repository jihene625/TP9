package solution;

import bandeau.Bandeau;
import java.awt.*;

public class CarParCar extends Effet {

    public void excecuter(Bandeau b) {
        String[] message = {"N", "E", "T" , "F", "L", "I", "X"};
        for (int i = 0; i <= message.length; i++) {
            b.sleep(500);
            b.setMessage(message[i]);
            b.setForeground(Color.RED);
        }

    }

}