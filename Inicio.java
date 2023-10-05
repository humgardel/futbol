/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoenclase_programacioni_garcia;

/**
 *
 * @author HUMGARDEL
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Futbolista fut1 = new Futbolista("Casillas",1,Demarcacion.PORTERO,Equipo.REAL_MADRID);
        Futbolista fut2 = new Futbolista("Capdevila", 11, Demarcacion.DEFENSA, Equipo.VILLAREAL);
        Futbolista fut3 = new Futbolista("Iniesta", 6, Demarcacion.CENTROCAMPISTA, Equipo.BARCA);
        Futbolista fut4 = new Futbolista("Navas", 22, Demarcacion.DELANTERO, Equipo.SEVILLA);
        
        System.out.println(fut1.toString());
        System.out.println(fut2.toString());
        System.out.println(fut3.toString());
        System.out.println(fut4.toString());
    }
    
}
