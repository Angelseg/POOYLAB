package _p120_Vehiculo;

public class Sedan extends Maquina implements Familiar {
    public Sedan(String Nombre, String Propetario,int Pasajeros) {
        super(Nombre, Propetario, Pasajeros);
    }

    @Override
    public void SistemaElectrico() {
        System.out.println("Es un Automovil con sistema electrico es un Sedan");
    }

    @Override
    public void CombustionInterna() {
        System.out.println("Es un automóvil de combustion interna es un Sedan");
    }

    @Override
    public void CarroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
    }

    @Override
    public void ChasisMonoCasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
    }
}
