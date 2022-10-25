/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class AhorcadoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     int contador =0;
     
    
    public void crearJuego(Ahorcado p){
        
        
        
        System.out.println("ingrese la palabra para jugar");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de intentos");
        p.setIntentos(leer.nextInt());
        p.setLetras(0);
        
        
        
        String[] pala2 = new String[palabra.length()];
        //Guarda la pabla en el array del objeto
        for (int i = 0; i < palabra.length(); i++) {
         pala2[i]= palabra.substring(i, i+1);
         p.setBuscada(pala2);
            
        }
//        
//        for (int i = 0; i < palabra.length(); i++) {
//            
//                  
//            System.out.print(p.getBuscada()[i]);
//           
//        }
        
        
        
    }
    
    public void longitud(Ahorcado l){
        
        System.out.println("el tamaño de la palabra buscada es de " + l.getBuscada().length + " letras");
        
        
    }
    
    public void buscar(Ahorcado le){
        
       
        
        System.out.println("Ingrese letra a buscar");
        String[] letra = new String[1];
        letra[0]=leer.next();
        
        for (int i = 0; i < le.getBuscada().length; i++) {
            if(le.getBuscada()[i].equalsIgnoreCase(letra[0])){
              contador++;
              

            }
            
        }
        
        if(contador>0){
                
                System.out.println("se encontro la letra");
            }else {
            
            System.out.println("No se encontro la letra");
            
        }
        
        
        
    }
    
    public Boolean encontradas(Ahorcado e){
        
        Boolean encontrada=true;
       if (contador==0){
           encontrada=false;
            e.setIntentos(e.getIntentos()-1);
       }else {
           
           System.out.println("la letra se encontro " + contador + " veces");
           System.out.println("le faltan " + (e.getBuscada().length-contador) + " letras");
           }
        
        return encontrada;  
    }
    
    public void intentos(Ahorcado i){
        
        System.out.println("le quedan " + i.getIntentos() + " intentos");
        
    }
    
    public void juego(Ahorcado j){
        
       
       
        this.buscar(j);
        this.encontradas(j);
        this.intentos(j);
         if (contador==j.getBuscada().length){
             
             j.setIntentos(0);
             System.out.println("Encontro la palabra");
             
         }
       
    }
}
