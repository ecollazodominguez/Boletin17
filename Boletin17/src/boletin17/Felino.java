package boletin17;

public class Felino extends Mamifero implements IPodeNadar {

    @Override
    public void nadar() {
        System.out.println("O felino "+this+" nada");
    }
}
