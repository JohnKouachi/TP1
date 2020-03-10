/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1;

/**
 *
 * @author Jorge
 */
public class Petroleiro extends Navio {
   
    private float carga;
    
    public Petroleiro(String matricula) {
        super(matricula);
    }
    
    public float getCarga() {
        return carga;
    }
    
    public void setCarga(float carga) {
        this.carga = carga;
    }

}


