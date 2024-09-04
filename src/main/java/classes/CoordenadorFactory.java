package src.main.java.classes;

import src.main.java.interfaces.ICargo;
import src.main.java.interfaces.ICargoFactory;
import src.main.java.interfaces.IEscolaridade;

public class CoordenadorFactory implements ICargoFactory {
    @Override
    public ICargo criarCargo() {
        return new Coordenador();
    }

    @Override
    public IEscolaridade criarEscolaridade() {
        return new Graduacao();
    }
}