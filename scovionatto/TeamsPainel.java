/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scovionatto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import static scovionatto.Players.players;

/**
 *
 * @author Diogo
 */
public class TeamsPainel {
    
    public void TelaTeams () {
        
        String valor1 = JOptionPane.showInputDialog("Número de jogadores do campeonato:");
        int valor1int = Integer.parseInt(valor1);
        
      
        String[] times = new String[valor1int];
        
        
        if (valor1int <= 8) {
        
        for (int i = 0; i<valor1int; i++) {
            String valor2 = JOptionPane.showInputDialog("Nome do participante:");
            times [i] = valor2;
            
        }
        
        List<String> selecoes = new ArrayList<String>();  
        selecoes.add("Itália");
        selecoes.add("Inglaterra");
        selecoes.add("Brasil");
        selecoes.add("Argentina");
        selecoes.add("Alemanha");
        selecoes.add("Holanda");
        selecoes.add("Espanha");
        selecoes.add("Belgica");

//Embaralhamos as selecoes:  
Collections.shuffle(selecoes);  

  
//Mostramos 6 aleatórios  
for (int i = 0; i < valor1int; i++) {  
     String mParticipante = String.format ("Participante: %s\n",times[i]);
     String mTime = String.format ("Seleção:%s\n",selecoes.get(i));
     String mensagemTotal = String.format("%s \n %s \n", mParticipante, mTime);
    JOptionPane.showMessageDialog(null, mensagemTotal);
  
}  

    }
    
     else {
JOptionPane.showMessageDialog(null, "Selecione até 8 jogadores!\n");
}
        
    }
}
