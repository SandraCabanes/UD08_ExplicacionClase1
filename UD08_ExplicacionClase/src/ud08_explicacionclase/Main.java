/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud08_explicacionclase;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Main {

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
// HACER EL ARRAY LIST SIEMPRE DE LA CLASE PADRE
    public static void main(String[] args) {
        Entrenador delBosque = new Entrenador("284EZ89", 1, "Vicente", "Del Bosque", 60);
        Futbolista iniesta = new Futbolista(2, "Interior Derecho", 6, "Andrés", "Iniesta", 29);
        Masajista raulMartinez = new Masajista("Licenciado en Fisioterapia", 18, 3, "Raúl", "Martinez", 41);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        //CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentración."
                + "(Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.println(integrante.getNombre() + "" + integrante.getApellidos() + " -> ");
            integrante.concentrarse();
        }
        //VIAJE

        System.out.println("Todos los integrantes viajan para jugar un partido."
                + "(Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.println(integrante.getNombre() + "" + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }
        
        //ENTRENAMIENTO
        
        System.out.println("nEntrenamiento: Solamente el entrenador y el futbolista"
                + "tienen métodos para entrenar: ");
        System.out.println(delBosque.getNombre()+""+delBosque.getApellidos()+" -> ");
        delBosque.dirigirEntreno();
        System.out.println(iniesta.getNombre()+""+iniesta.getApellidos()+" -> ");
        iniesta.entrenar();
        
        //MASAJE
        System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje");
        System.out.println(raulMartinez.getNombre()+""+delBosque.getApellidos()+" -> ");
        raulMartinez.darMasaje();
        
        //PARTIDO DE FUTBOL
        System.out.println("nPartido de fútbol: Solamente el entrenador y el futbolista tiene métodos para el partido de fútbol:");
        System.out.println(delBosque.getNombre()+""+delBosque.getApellidos()+" -> ");
        delBosque.dirigirPartido();
        System.out.println(iniesta.getNombre()+""+iniesta.getApellidos()+" -> ");
        iniesta.jugarPartido();
    }

}
