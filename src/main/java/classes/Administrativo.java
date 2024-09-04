package src.main.java.classes;

import src.main.java.interfaces.ICargo;
import src.main.java.interfaces.IEscolaridade;

public class Administrativo implements ICargo {
    @Override
    public double calcularSalario(double salarioBase, double horasAula, double valorHora, IEscolaridade escolaridade) {
        return salarioBase;
    }
}