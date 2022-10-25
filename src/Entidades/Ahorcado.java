/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author A288808
 */
public class Ahorcado {
   
    private int tvector;
    private String buscada[];
    private int intentos;
    //Atributo encontradas
    private int letras;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscada, int intentos, int letras, int tvector) {
        this.buscada = buscada;
        this.intentos = intentos;
        this.letras = letras;
        this.tvector = tvector;
    }

    public String[] getBuscada() {
        return buscada;
    }

    public void setBuscada(String[] buscada) {
        this.buscada = buscada;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
     public int gettvector() {
        return tvector;
    }

    public void settvector(int tvector) {
        this.tvector = tvector;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

   
    
    
    
    
}
