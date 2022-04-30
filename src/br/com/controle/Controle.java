/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

/**
 *
 * @author laboratorio
 */
public class Controle {
    Double Valor;
    double resulMaior = 0;

    public double getMaior() {
        return resulMaior;
    }

    public void setMaior(double maior) {
        this.resulMaior = resulMaior;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }
    
    
    public void Desc(){
        Valor = Valor - (Valor * 0.11);
    }
    
    public void Maior(){
        
        if (Valor > resulMaior){
            resulMaior = Valor;
        }
        
        
    }
}
