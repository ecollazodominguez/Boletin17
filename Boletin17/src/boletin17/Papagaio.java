package boletin17;

public class Papagaio extends Aves implements IPodeCaminhar, IPodeVoar {

    @Override
    public void voar() {
        System.out.println("O papagaio voa");
    }

    @Override
    public void caminhar() {
        System.out.println("O papagaio camiña");
    }
}
