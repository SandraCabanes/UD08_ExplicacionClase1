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
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;
    
    public Masajista(){
        super();
    }
    
    public void darMasaje(){
        
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    
}
