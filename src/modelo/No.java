/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class No<T> {
    private T elemento;
    private No proximo;

    public No(T elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(T elemento) {
        this.elemento = elemento;
    }
    
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    
    
}
