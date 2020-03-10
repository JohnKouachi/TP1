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
public class Navio {
    
    private String matricula;
    private String nome;
    private float comprimento;
    
    public Navio(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
    this.comprimento = comprimento;
    }

}

