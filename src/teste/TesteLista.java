/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import controller.ListaLigada;
import javax.swing.JOptionPane;
import modelo.Aluno;

/**
 *
 * @author User
 */
public class TesteLista {
    
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("AlfredO", "MASCULINO", 19);
        Aluno aluno2 = new Aluno("Mars", "MASCULINO", 21);
        Aluno aluno3 = new Aluno("Yven", "MASCULINO", 12);
        Aluno aluno4 = new Aluno("Herqui", "MASCULINO", 11);
        Aluno aluno5 = new Aluno("Siko", "MASCULINO", 0);
        
        ListaLigada ligada = new ListaLigada();
        
         ligada.addFim(aluno);
         ligada.addFim(aluno2);
         ligada.addFim(aluno3);
         ligada.addFim(aluno4);
         ligada.addIn(aluno5);
         
         ligada.addPos(3, new Aluno("NoName", "NOSEX000", 000));
        
        
        JOptionPane.showMessageDialog(null, ligada.getTotal());
        JOptionPane.showMessageDialog(null, ligada.listar());
        JOptionPane.showMessageDialog(null, ligada.get(4).getElemento());
        
        ligada.remover(0);
        JOptionPane.showMessageDialog(null, ligada.listar());
       
        JOptionPane.showMessageDialog(null, ligada.verificaObj(aluno5));
        
        
        
        
    }
   
    
    
    
    
    
}
