package src.main.java.classes;

import src.main.java.interfaces.ICargo;
import src.main.java.interfaces.ICargoFactory;
import src.main.java.interfaces.IEscolaridade;

public class AdministrativoFactory implements ICargoFactory {
    @Override
    public ICargo criarCargo() {
        return new Administrativo();
    }

    @Override
    public IEscolaridade criarEscolaridade() {
        return new EnsinoMedio();
    }
}