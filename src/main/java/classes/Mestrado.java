package src.main.java.classes;

import src.main.java.interfaces.IEscolaridade;

public class Mestrado implements IEscolaridade {
    @Override
    public double getPercentualAumento() {
        return 0.2;
    }
}