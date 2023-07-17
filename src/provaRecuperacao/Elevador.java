/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provaRecuperacao;

import javax.swing.JOptionPane;

/**
 *
 * @author isabe
 */
public class Elevador {
     private int andarAtual;
    private int totalAndares; 
    private int capacidadede;
    private int quantidPessoas;//Para contar quantas pessoas estão presentes no elevador
    
    
    public Elevador(){
        
    }
    
    public Elevador(int andarAtual, int totalAndares, int capacidade, int pessoas){
        
        this.andarAtual=0;
        this.capacidadede=capacidade;
        this.quantidPessoas=pessoas;
        this.totalAndares = totalAndares;
    }
    
    /**
     * @return the andarAtual
     */
    public int getAndarAtual() {
        return andarAtual;
    }

    /**
     * @param andarAtual the andarAtual to set
     */
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    /**
     * @return the totalAndares
     */
    public int getTotalAndares() {
        return totalAndares;
    }

    /**
     * @param totalAndares the totalAndares to set
     */
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    /**
     * @return the capacidadede
     */
    public int getCapacidadede() {
        return capacidadede;
    }

    /**
     * @param capacidadede the capacidadede to set
     */
    public void setCapacidadede(int capacidadede) {
        this.capacidadede = capacidadede;
    }

    /**
     * @return the lotacaoAtual
     */
    public int getquantidPessoas() {
        return quantidPessoas;
    }

    
    public void setnumPessoasAtual(int numpessoas) {
        this.quantidPessoas = numpessoas;
    }
    
    
    public void inicializar(int capacidadeElevador, int totalAndares){
        
        this.capacidadede = capacidadeElevador;
        this.totalAndares = totalAndares;
    }
    
    public void entrar(){
        
        if(this.capacidadede > this.quantidPessoas){
            this.quantidPessoas++;
        }
        else{
            JOptionPane.showMessageDialog(null,"O elevador está cheio! Por favor aguarde alguem descer.");
        }
    }
    
    public void sair(){
        if(this.quantidPessoas >= 1){
            this.quantidPessoas--;
        }
        else{
            JOptionPane.showMessageDialog(null,"O elevador está Vazio! Não pode retirar ninguem porque ninguem está lá!");
        }
    }
    
    public void subir(){
        
        if(this.andarAtual < this.totalAndares){
            this.andarAtual++;
        }
        else{
            JOptionPane.showMessageDialog(null,"O elevador está no ultimo andar! Você só pode descer.");
        }
    }
    
    public void descer(){
        
        if(this.andarAtual > 1){
            this.andarAtual--;
        }else{
            JOptionPane.showMessageDialog(null,"O elevador está no terreo! Você só pode subir.");
        }
    }
    public int andar(){
        return this.andarAtual;
    }
    public int pessoas(){
        return this.quantidPessoas;
    }
    
}
