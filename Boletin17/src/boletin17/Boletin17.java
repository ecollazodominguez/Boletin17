/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avestruz ave = new Avestruz();
        Gato gat = new Gato();
        Morcego mor = new Morcego();
        Papagaio papa = new Papagaio();
        Tigre tig = new Tigre();
        
        ave.caminhar();
        gat.caminhar();//Herda de mamifero
        gat.nadar();//Herda de felino
        mor.caminhar();
        mor.voar();
        papa.voar();
        papa.caminhar();
        tig.caminhar();//Herda de mamifero
        tig.nadar();//Herda de felino
    }
    
}
