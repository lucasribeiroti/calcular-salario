package src.main.java.classes;

import src.main.java.interfaces.ICargo;
import src.main.java.interfaces.IEscolaridade;

public class Professor implements ICargo {
    @Override
    public double calcularSalario(double salarioBase, double horasAula, double valorHora, IEscolaridade escolaridade) {
        double salario = horasAula * valorHora;
        return salario + (salario * escolaridade.getPercentualAumento());
    }
}