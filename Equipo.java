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
public enum Equipo {
    BARCA("FC Barcelona"), REAL_MADRID("Real Madrid"), VILLAREAL("Villareal"), SEVILLA("Sevilla FC");
    
    private String nombreClub;
    
    private Equipo (String nombreClub_){
        this.nombreClub=nombreClub_;
        
    }
    
    public String getNombreClub(){
        return this.nombreClub;
    }
    
}
