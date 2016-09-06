/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scovionatto;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Workbook;


/**
 *
 * @author Diogo
 */
public class Tabela {
    
        public static void main(String[] args) throws FileNotFoundException, IOException {  
        Scanner in = new Scanner(System.in);  
        
         String filename = "C:/Users/Diogo/Desktop/Scovionatto/NewExcelFile.xls" ;
         HSSFWorkbook workbook = new HSSFWorkbook();
         HSSFSheet sheet =  workbook.createSheet("Scovionatto");  
           
        List<String> clubes = new ArrayList<String>();  
        System.out.println("Entre com o nome dos clubes. Deixe em branco para terminar.");  
        String clube = "";  
                      
            
        do {  
            clube = in.nextLine().trim();  
            if (!clube.isEmpty()) {  
                clubes.add(clube);  
            }  
        } while (!clube.isEmpty());  
  
        if (clubes.size() % 2 == 1) {  
            clubes.add(0, "");  
        }  
  
        
        
        int t = clubes.size();  
        int m = clubes.size() / 2;
  
        
        for (int i = 0; i < t - 1; i++) {  
 
            HSSFRow row = sheet.createRow((short)i);    
            row.createCell(0).setCellValue((i+1)+"a rodada: ");
            
            System.out.print((i + 1) + "a rodada: ");  
            for (int j = 0; j < m; j++) {  
                //Clube está de fora nessa rodada?                
                if (clubes.get(j).isEmpty())  
                    continue;  
  
                //Teste para ajustar o mando de campo  
                if (j % 2 == 1 || i % 2 == 1 && j == 0)  {
                    
                    row.createCell(j+1).setCellValue(clubes.get(t - j - 1) + " x " + clubes.get(j) + "   ");
                    System.out.print(clubes.get(t - j - 1) + " x " + clubes.get(j) + "   ");
                    
                }
                else{  
                    row.createCell(j+1).setCellValue(clubes.get(j) + " x " + clubes.get(t - j - 1) + "   ");
                    System.out.print(clubes.get(j) + " x " + clubes.get(t - j - 1) + "   ");  
                    
                }
                
            }  
            System.out.println();  
            //Gira os clubes no sentido horário, mantendo o primeiro no lugar  
            clubes.add(1, clubes.remove(clubes.size()-1));  
        }  
    
            FileOutputStream fileOut =  new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Seu arquivo excel foi gerado!");
    }  
}
    

