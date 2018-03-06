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
public class Entrenador extends SeleccionFutbol{
    private String idFederacion;
    
    public Entrenador(){
        super();
    }

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    public void dirigirPartido(){
        
    }
    
    public void dirigirEntreno(){
        
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
}
