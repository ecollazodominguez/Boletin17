package boletin17;

public class Morcego extends Aves implements IPodeVoar, IPodeCaminhar {

    @Override
    public void caminhar() {
        System.out.println("O morcego camiña");
    }

    @Override
    public void voar() {
        System.out.println("O morcego voa");
    }
}
