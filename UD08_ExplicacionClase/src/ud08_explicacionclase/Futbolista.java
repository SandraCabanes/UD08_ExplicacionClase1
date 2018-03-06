/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud08_explicacionclase;

/**
 *
 * @author mati
 */
public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(){
        super(); //lama al constructor del padre
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }    
    
    
    public void jugarPartido(){
        
    }
    
    public void entrenar(){
        
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    
}
