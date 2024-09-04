package src.main.java.classes;

import src.main.java.interfaces.ICargo;
import src.main.java.interfaces.ICargoFactory;
import src.main.java.interfaces.IEscolaridade;

public class Profissional {
    private ICargo cargo;
    private IEscolaridade escolaridade;
    private double salarioBase;
    private double horasAula;
    private double valorHora;

    public Profissional(ICargoFactory factory, double salarioBase, double horasAula, double valorHora) {
        this.cargo = factory.criarCargo();
        this.escolaridade = factory.criarEscolaridade();
        this.salarioBase = salarioBase;
        this.horasAula = horasAula;
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return cargo.calcularSalario(salarioBase, horasAula, valorHora, escolaridade);
    }
}