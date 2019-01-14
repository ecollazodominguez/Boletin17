package boletin17;

public class Mamifero implements IPodeCaminhar {

    @Override
    public void caminhar() {
        System.out.println("O mamífero "+this+" camiña");
    }
}
