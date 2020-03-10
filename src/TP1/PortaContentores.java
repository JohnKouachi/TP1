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
public class PortaContentores extends Navio {
    
    private int noContentores;

    public PortaContentores(String matricula) {
        super(matricula);
    }
    
    public int getNoContentores() {
        return noContentores;
    }

    public void setNoContentores(int noContentores) {
        this.noContentores = noContentores;
    }
    
}

