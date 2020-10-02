/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.Aluno;
import modelo.No;

/**
 *
 * @author User
 */
public class ListaLigada<T> {
    private No primeiro;
    private No ultimo;
    private int total = 0;
    
 
    
    public void addIn(Aluno aluno){
        No novo = new No(aluno,this.primeiro);
        this.primeiro = novo;
        
        if(total==0)
            this.ultimo = this.primeiro;
        
        total++;
           
    }// adiciona no fim
    
    public void addFim(Aluno aluno){
        if(total == 0)
            addIn(aluno);
        else{
            No novo = new No(aluno);
            this.ultimo.setProximo(novo);
            ultimo = novo;
            total++;
        }    
    } // adiciona no fim
    
    public String listar(){
        No noAux = this.primeiro;
        String nomes = "";
        while(noAux != null){
            nomes += noAux.getElemento().toString()+"\n";
            noAux = noAux.getProximo();     
        }   
        return nomes;
    } // Listar
    
    public void addPos(int posicao,Aluno aluno){
        
        
            if(posicao == 0)
                addIn(aluno);
            else
                if(posicao == total)
                    addFim(aluno);
                else{
                    No anterior = get(posicao-1);
                    No novo = new No(aluno,anterior.getProximo());
                    anterior.setProximo(novo);
                    this.total++;
                }
                    
    }
    
    public void remover(int posicao){
        if (posicao == 0)
           removerIn();
        
        else{
            No actual = get(posicao);
            No anterior = get(posicao-1);

            anterior.setProximo(actual.getProximo());
            total--;
            
        }
        
    }
    
    public void removerIn(){
        this.primeiro = primeiro.getProximo();
    }
    
    public No get(int posicao){
        T aluno;
        No noAux = this.primeiro;
        if (!verfificaPos(posicao))
            throw new IllegalArgumentException("Posicao nao Existe");
        else
            for(int i = 0;i<posicao;i++)
                noAux = noAux.getProximo();
        
        aluno = (T) noAux.getElemento();
        
        return noAux;
      
    }
    
    public boolean verificaObj(Aluno aluno){
        No noAux = this.primeiro;
        while(noAux != null){
            if(noAux.getElemento().equals(aluno))
                return true;
            
            noAux = noAux.getProximo();     
        }
        
        return false;
        
    }
    
    public boolean verfificaPos(int pos){
        return ((pos>0) && (pos<total));
    }

    public int getTotal() {
        return total;
    }
    
}
