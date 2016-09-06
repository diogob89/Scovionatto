/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scovionatto;
import javax.swing.JOptionPane;


/**
 *
 * @author Diogo
 */
public class PlayersPainel {
    
    public void TelaPlayers() {
    
    String valor1 = JOptionPane.showInputDialog("Número de jogadores do campeonato:");
    int valor1int = Integer.parseInt(valor1);
    
    int total=0;
    int n=0;
    int tempo;
    int tempomin = 0;
    
    if (valor1int <= 8) {
    
    for (int y = 1; y<valor1int; y++){
            n++;
            total = total + n;
        }
    
    }
    
    else {
            JOptionPane.showMessageDialog(null, "Selecione até 8 jogadores!\n");
            }
    
    
    
    tempo = 5 * total;
    
    String totalS = Integer.toString(total);
    String mTotal = String.format ("Número total de partidas: %s \n", totalS); 
    

    if (tempo > 60) {
            tempomin = tempo%60;
            tempo = tempo/60;
            String tempoS = Integer.toString(tempo);
            String tempominS = Integer.toString(tempomin);
            String mTempo = String.format ("Duração do campeonato é de %s horas e %s minutos\n ",tempoS,tempominS);
            JOptionPane.showMessageDialog(null, mTotal);
            JOptionPane.showMessageDialog(null, mTempo);
        }
        else {
        tempo = tempo;
        String tempoS = Integer.toString(tempo);
        String mTempoP = String.format ("Duração do campeonato é de: %s minutos\n ",tempoS);
        JOptionPane.showMessageDialog(null, mTotal);
        JOptionPane.showMessageDialog(null, mTempoP);
    }
           
    }
}

   
    
    
    


