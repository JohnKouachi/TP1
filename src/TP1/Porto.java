/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class Porto {
   
    private List<Navio> navios;

    public Porto() {
        navios = new ArrayList<>();
        
    } 
    
    private boolean procura(Navio nv) {
        for(Navio n:navios){
            if(n.getMatricula().equals(nv.getMatricula())) return true;
        }
        return false;
    }
    
    public void addNavio( Navio n){
        if(!procura(n))      
            navios.add(n);
    }

    public int getCapacidadeTotal() {

        int ct = 0;
        for (Navio n : navios) {
            if (n instanceof PortaContentores) {
                ct += ((PortaContentores) n).getNoContentores();
                        
            }
        }

        return ct;
    }

    public float getCargaTotal() {
        float total = 0;
        for (Navio p : navios) {
            if (p instanceof PortaContentores) {
                total += ((PortaContentores) p).getNoContentores() * 10f;
            }
            if (p instanceof Petroleiro) {
                total += ((Petroleiro) p).getCarga();
            }
        }
        return total;
    }
    
    public void listNavios(){
        for(Navio n:navios)
                System.out.println(n);
    }
    
   


//main
    public static void main(String[] args) {
        //criação do porto
        Porto porto = new Porto();
    
        //criação de navios
        Petroleiro petro1 = new Petroleiro("P1"); petro1.setCarga(20); petro1.setNome("petroleiro 1");
        
        Petroleiro petro2 = new Petroleiro("P2"); petro2.setCarga(20); petro2.setNome("petroleiro 2");
        
        PortaContentores pConta1 = new PortaContentores("PC01"); pConta1.setNoContentores(10); pConta1.setNome("Porta Contentores 1");
    
        PortaContentores pConta2 = new PortaContentores("PC02"); pConta2.setNoContentores(30); pConta2.setNome("Porta Contentores 2");
    
        Navio n = new Navio("N01"); n.setComprimento(4); n.setNome("Navio 1");
    
            
        //adicionar os navios
        porto.addNavio(petro1);
        porto.addNavio(petro2);
        porto.addNavio(pConta1);
        porto.addNavio(pConta2);
        porto.addNavio(n);
        
        //verificar atributos
        porto.listNavios();
        
        //print de capacidade total e cont26entores 
        System.out.println("Capacidade t5notal = " + porto.getCargaTotal() + " toneladas.");
        System.out.printf("carga = %.1f %n",  porto.getCargaTotal());
       
        System.out.println("contentores total = " + porto.getCapacidadeTotal());
        
    }
}



