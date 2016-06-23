/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class urna {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cont1 = 0, cont2=0, cont3= 0, votob = 0, voton = 0, voto = 0;
        String sair = "não";
        
        do {
        System.out.println ("Vote no seu candidato" + "\nJosé - 1 " + "\nMaria - 2" + "\nJoão - 3"+ "\nBranco - 0"); 
        voto = entrada.nextInt();
        switch (voto){
            case 1:
                cont1++;
                break;
            case 2:
                cont2++;
                break;
            case 3:
                cont3++;
                break;
            case 0:
                votob++;
                break;
            default:
                voton++; 
        }
         System.out.println("-------------\n" + "SAIR? ");
         sair=entrada.next();
        } while (!sair.equalsIgnoreCase("sim"));
          float cand1= (100*cont1) / (cont1 + cont2 + cont3);
          float cand2= (100*cont2) / (cont1 + cont2 + cont3);
          float cand3= (100*cont3) / (cont1 + cont2 + cont3);
          int votosv = (cont1 + cont2 + cont3 );
          int votost = (cont1 + cont2 + cont3 + voton + votob);
        
          
          
          System.out.println (" ---Resultado---\n"
        
                      +cont1+ " Candidato 1\n"
                      +cont2+ " Cabdidato 2\n"
                      +cont3+ " Candidato 3\n"
                      +votob+ " Voto Branco 4\n"
                      +voton+ " Voto Nulo\n" 
                      +votosv+ " Votos válidos totais\n"
                      +votost+ " Votos Totais");
        
         
        
        
        if (cont1 > cont2 && cont1 > cont3 && cand1 > 50 ){
            System.out.println ("Eleições decididas no 1º turno" + "\nO Candidato 1 venceu!!");
        }else if (cont2>cont1 && cont2>cont3 && cand2> 50){
            System.out.println ("Eleições decididas no 1º turno" +"\nO Candidato 2 venceu!!");
        }else if (cand3> 50){
            System.out.println ("Eleições decididas no 1º turno" +"\nO Candidato 3 venceu!!");
        }else {
            System.out.println ("Eleição será decidida no 2º Turno");}
   
      
        }

}
