/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scovionatto;
import java.util.Scanner;


/**
 *
 * @author Diogo
 */
public class Players {
    
    Scanner input = new Scanner (System.in);
    
    public static int players;
    
    public void QtdPlayers (){
        
        System.out.println("Número de jogadores do campeonato:");
        players = input.nextInt();
        
        TeamPlayers tp = new TeamPlayers ();
        
        tp.SelectTeam();
        
        int total=0;
        int n=0;
        
        for (int y = 1; y<players; y++){
            n++;
            total = total + n;
        }
        
        System.out.printf ("Número total de partidas: %d\n ",total);
        
        int tempo;
        int tempomin = 0;
        
        tempo = total * 5;
        
        
        if (tempo > 60) {
            tempomin = tempo%60;
            tempo = tempo/60;
        System.out.printf ("Duração do campeonato é de: %d hora(s) e %d minutos\n ",tempo,tempomin);
        }
        else 
            System.out.printf ("Duração do campeonato é de: %d minutos\n ",tempo);
    }

}
