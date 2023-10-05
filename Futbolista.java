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
public class Futbolista {
    private String nombre;
    private int dorsal;
    private Demarcacion demarcacion;
    private Equipo equipo;
    
    public Futbolista(String nombre_, int dorsal_, Demarcacion demarcacion_, Equipo equipo_){
        this.nombre=nombre_;
        this.dorsal=dorsal_;
        this.demarcacion=demarcacion_;
        this.equipo=equipo_;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getDorsal(){
        return this.dorsal;
    }
    
    public Demarcacion getDemarcacion(){
        return this.demarcacion;
    }
    
    public String getEquipo(){
        return this.equipo.getNombreClub();
    }
    
    public String toString(){
        String cadena;
        cadena= this.getDorsal()+" - "+this.getNombre()+" - "+this.getDemarcacion()+" - "+this.getEquipo();
        return cadena;
    }
}
