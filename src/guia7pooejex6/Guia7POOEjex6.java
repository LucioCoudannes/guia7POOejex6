/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooejex6;

import Entidades.Ahorcado;
import Servicios.AhorcadoService;

/**
 *
 * @author A288808
 */
public class Guia7POOEjex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AhorcadoService as = new AhorcadoService();
        Ahorcado p1 = new Ahorcado();
        
        as.crearJuego(p1);
        as.longitud(p1);
        
        do {
            as.juego(p1);
        } while (p1.getIntentos()!=0&&p1.getLetras()<p1.getBuscada().length);
        
        
        
        
        
        
    }
    
}
