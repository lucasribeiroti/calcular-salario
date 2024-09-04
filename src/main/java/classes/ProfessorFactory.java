package src.main.java.classes;

import src.main.java.interfaces.ICargo;
import src.main.java.interfaces.ICargoFactory;
import src.main.java.interfaces.IEscolaridade;

public class ProfessorFactory implements ICargoFactory {
    @Override
    public ICargo criarCargo() {
        return new Professor();
    }

    @Override
    public IEscolaridade criarEscolaridade() {
        return new Mestrado();
    }
}
