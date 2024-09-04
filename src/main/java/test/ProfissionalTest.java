package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.classes.*;
import src.main.java.interfaces.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfissionalTest {

    @Test
    public void testCalculoSalarioAdministrativoEnsinoMedio() {
        ICargoFactory factory = new AdministrativoFactory();
        Profissional profissional = new Profissional(factory, 1400.0, 0, 0);
        double salarioEsperado = 1400.0 + (1400.0 * 0.0);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioAdministrativoGraduacao() {
        ICargoFactory factory = new AdministrativoFactory() {
            @Override
            public IEscolaridade criarEscolaridade() {
                return new Graduacao();
            }
        };
        Profissional profissional = new Profissional(factory, 1400.0, 0, 0);
        double salarioEsperado = 1400.0 + (1400.0 * 0.0);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioAdministrativoMestrado() {
        ICargoFactory factory = new AdministrativoFactory() {
            @Override
            public IEscolaridade criarEscolaridade() {
                return new Mestrado();
            }
        };
        Profissional profissional = new Profissional(factory, 1400.0, 0, 0);
        double salarioEsperado = 1400.0 + (1400.0 * 0.0);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioAdministrativoDoutorado() {
        ICargoFactory factory = new AdministrativoFactory() {
            @Override
            public IEscolaridade criarEscolaridade() {
                return new Doutorado();
            }
        };
        Profissional profissional = new Profissional(factory, 1400.0, 0, 0);
        double salarioEsperado = 1400.0 + (1400.0 * 0.00);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioCoordenadorEnsinoMedio() {
        ICargoFactory factory = new CoordenadorFactory() {
            @Override
            public IEscolaridade criarEscolaridade() {
                return new EnsinoMedio();
            }
        };
        Profissional profissional = new Profissional(factory, 2400.0, 0, 0);
        double salarioEsperado = 2400.0 + (2400.0 * 0.0);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioCoordenadorGraduacao() {
        ICargoFactory factory = new CoordenadorFactory();
        Profissional profissional = new Profissional(factory, 2400.0, 0, 0);
        double salarioEsperado = 2400.0 + (2400.0 * 0.1);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioCoordenadorMestrado() {
        ICargoFactory factory = new CoordenadorFactory() {
            @Override
            public IEscolaridade criarEscolaridade() {
                return new Mestrado();
            }
        };
        Profissional profissional = new Profissional(factory, 2400.0, 0, 0);
        double salarioEsperado = 2400.0 + (2400.0 * 0.2);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioCoordenadorDoutorado() {
        ICargoFactory factory = new CoordenadorFactory() {
            @Override
            public IEscolaridade criarEscolaridade() {
                return new Doutorado();
            }
        };
        Profissional profissional = new Profissional(factory, 2400.0, 0, 0);
        double salarioEsperado = 2400.0 + (2400.0 * 0.3);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioProfessorMestrado() {
        ICargoFactory factory = new ProfessorFactory();
        Profissional profissional = new Profissional(factory, 0, 20, 50.0);
        double salarioEsperado = (20 * 50.0) + ((20 * 50.0) * 0.2);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }

    @Test
    public void testCalculoSalarioProfessorDoutorado() {
        ICargoFactory factory = new ProfessorFactory() {
            @Override
            public IEscolaridade criarEscolaridade() {
                return new Doutorado();
            }
        };
        Profissional profissional = new Profissional(factory, 0, 20, 50.0);
        double salarioEsperado = (20 * 50.0) + ((20 * 50.0) * 0.3);
        assertEquals(salarioEsperado, profissional.calcularSalario());
    }
}