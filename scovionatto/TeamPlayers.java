/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scovionatto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static scovionatto.Players.players;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class TeamPlayers {
    
    public void SelectTeam (){
        String[] times = new String[players];
        Scanner input = new Scanner (System.in);
        String resposta;
        
        for (int i = 0; i<players; i++) {
            System.out.println("Nome do participante:");
            times [i] = input.nextLine();
            
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
for (int i = 0; i < players; i++) {  
   System.out.printf("Participante %s - Seleção: %s\n",times[i],selecoes.get(i)); 
   System.out.printf("É repetido?"); 
   resposta = input.next();
   if(resposta=="NAO"||resposta=="Nao"||resposta=="nao"||resposta=="N"||resposta=="n"||resposta=="Não")
    selecoes.remove(i);
}  

Collections.shuffle(selecoes); 
    
int repetidos;

System.out.printf("Quantidade de jogadores repetidos: ");
repetidos = input.nextInt();

String[] timesRep = new String[repetidos];


for (int l = 0; l < repetidos; l++) {
            System.out.println("Nome do participante:");
            timesRep [l] = input.next();
        }


//int l = 0;
//
//while (l < repetidos) {
//            System.out.println("Nome do participante:");
//            times [l] = input.nextLine();
//            l++;
//}

for (int i = 0; i < repetidos; i++) {  
   System.out.printf("Participante %s - Seleção: %s\n",timesRep[i],selecoes.get(i)); 
}

    }
    
    }
