package src.main.java.classes;

import src.main.java.interfaces.IEscolaridade;

public class Graduacao implements IEscolaridade {
    @Override
    public double getPercentualAumento() {
        return 0.1;
    }
}
