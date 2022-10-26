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
 
    }
    
    public void longitud(Ahorcado l){
        
        System.out.println("el tamaño de la palabra buscada es de " + l.getBuscada().length + " letras");
        
        
    }
    
    public void buscar(Ahorcado le, String letra){
        
       
        
        
        int contador1=0;
        
        for (int i = 0; i < le.getBuscada().length; i++) {
            if(le.getBuscada()[i].equalsIgnoreCase(letra)){
              contador1++;
              

            }
            
        }
        
        if(contador1>0){
                
             System.out.println("se encontro la letra");
             le.setLetras(contador1+le.getLetras());
            }else {
            
            System.out.println("No se encontro la letra");
            
        }
        
        
        
    }
    
    public Boolean encontradas(Ahorcado e,String letra){
        
        Boolean encontrada=false;
        for (int i = 0; i < e.getBuscada().length; i++) {
            if(e.getBuscada()[i].equalsIgnoreCase(letra)){
              encontrada=true;
              
            }
            
        } 
        
       if (encontrada){
           
            
            System.out.println("letras encontradas " + e.getLetras());
           System.out.println("le faltan " + (e.getBuscada().length-e.getLetras()) + " letras");
       }else {
           e.setIntentos(e.getIntentos()-1);
           System.out.println("letras encontradas " + e.getLetras());
           System.out.println("le faltan " + (e.getBuscada().length-e.getLetras()) + " letras");
           }
        
        return encontrada;  
    }
    
    public void intentos(Ahorcado i){
        
        System.out.println("le quedan " + i.getIntentos() + " intentos");
        
    }
    
    public void juego(Ahorcado j){
        
       System.out.println("Ingrese letra a buscar");
       
        String letra=leer.next();
       
        this.buscar(j, letra);
        this.encontradas(j,letra);
        this.intentos(j);
         if (j.getLetras()==j.getBuscada().length){
          
             System.out.println("Encontro la palabra");
             
         }
         if(j.getIntentos()==0){
             
             System.out.println("GAME OVER");
             
         }
         
         
       
    }
}
