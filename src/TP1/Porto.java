/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Porto {
   
    private int ct;
    private int noMaxNavios;
    
    
    ArrayList<Navio> navio;
    

    public Porto(int noMaxNavios) {
        ct = 0;
        this.noMaxNavios = noMaxNavios;
       
        navio = new ArrayList<Navio>(noMaxNavios);
    }

    public int getNoMaxNavios() {
        return noMaxNavios;
    }

    

    public void addNavio(Navio n) {

        if (ct == noMaxNavios) {
            System.out.println("Número máximo de navios (" + noMaxNavios + ") Atingido!!");
        }
        boolean confirma = false;
        for (Navio nave : navio) {
            if (n.equals(nave.getMatricula())) {
                System.out.println("Navio já existe!!");
                confirma = true;
            }

            if (!confirma) {
                navio.add(nave);
                ct++;
            }

        }

    }

    public int getCapacidadeTotal() {

        int total = 0;
        for (Navio p : navio) {
            if (p instanceof PortaContentores) {
                total += ((PortaContentores) p).getNoContentores();
                        
            }
        }

        return total;
    }

    public int getCargaTotal() {
        int total = 0;
        for (Navio p : navio) {
            if (p instanceof PortaContentores) {
                total += ((PortaContentores) p).getNoContentores() * 10;
            }
            if (p instanceof Petroleiro) {
                total += ((Petroleiro) p).getCarga() * 10;
            }
        }
        return total;
    }
    
   


//main
    public static void main(String[] args) {
        Porto porto = new Porto(3);
    
        Petroleiro petro1 = new Petroleiro("P1"); petro1.setCarga(200);
    
        PortaContentores pConta1 = new PortaContentores("PC01"); pConta1.setNoContentores(50);
    
        PortaContentores pConta2 = new PortaContentores("PC02"); pConta2.setNoContentores(20);
    
        Navio n = new Navio("N01");
    
        Petroleiro petro2 = new Petroleiro("P2"); petro2.setCarga(200);

        porto.addNavio(petro1);
        porto.addNavio(petro2);
        porto.addNavio(pConta1);
        porto.addNavio(pConta2);
        porto.addNavio(n);

        System.out.println("Capacidade total = " + porto.getCargaTotal() + " toneladas.");
        System.out.println("contentores total = " + porto.getCapacidadeTotal());
    }
}



