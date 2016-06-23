/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class questao7 {
    public static void main(String[] args) {
        Scanner soa = new Scanner (System.in);
        System.out.println ("Informe o metro quadrado a ser pintado");
        float area= soa .nextFloat ();
        float tinta = area/6;
        int lata=  (int) Math.ceil(tinta/18);
        int galao = (int)Math.ceil(tinta/ 3.6);
        float precoL = 80;
        float precoG = 25;
        double por =  10;
        float porcentagem= tinta * 0.10f;
        float mix = (float) ((tinta + porcentagem) /18);
        float mix2 = mix - ((int)mix);
        float mix3 =  (mix -mix2);
        float mix4 = (float) ((mix2*10)/3.6);
        float mix5 = 1;
        float preco1= precoG;
        float preco2= precoG*2;
        float preco3= precoG*3;
       
             
        if (lata >= 1.0){
            System.out.println ("Litros de tinta necessários para pintura:"+tinta+ "L");
            System.out.println ("Qtd Latas de 18 litros necessárias para pintura: "+ lata);
            System.out.println ("Valor = " + precoL * lata + "reais");
        }else{
            System.out.println ("Litros de tinta necessários para pintura:"+tinta+ "L");
            System.out.println ("Lata de 18 litros necessária: 01");
            System.out.println ("Valor = " + (precoL * 1) + "reais");
                }
        if (galao >= 1){
            System.out.println ("Litros de tinta necessários para pintura:"+tinta+ "L");
            System.out.println ("Qtd Galões de 3,6 litros necessários para pintura: "+ galao);
            System.out.println ("Valor = " + precoG * galao + " reais"); 
        }else{
            System.out.println ("Litros de tinta necessários para pintura:"+tinta+ "L");
            System.out.println ("Galoes de 3,6 litros necessário: 01");
            System.out.println ("Valor = " + (precoG * 1) + "reais");
        } 
        if (tinta != 0){
           System.out.println ("Litros de tinta necessários para pintura com 10%  :"+(tinta+porcentagem)+ "L");
            System.out.println ("Qtd de latas "+ mix3 );
            System.out.println ("Valor das latas "+ Math.round(mix)* precoL+ " reais");
            }else{
            System.out.println ("sem área para pintar");  }      
        if (mix4 < 0.6 && mix4 > 0.4){ 
            System.out.println ("Qtd de Galões= " + (mix4=3));
            System.out.println ("Valor dos Galões = " + (preco3)+ " reais");
            System.out.println ("Valor total= "+ Math.round(preco3 + (mix*precoL))+ " reais");
                    } else if (mix4 <0.4&& mix4> 0.2){ 
            System.out.println ("Qtd de Galões= "+ (mix4=2));
            System.out.println ("Valor dos Galões= " + (preco2)+ " reais");
            System.out.println ("Valor total= "+ Math.round(preco2 + (mix*precoL))+  " reais");
                    } else if (mix4 < 0.2){
            System.out.println ("Qtd de Galões= "+ (mix4=1));
            System.out.println ("Valor dos Galões= " + (preco1)+ " reais");
            System.out.println ("Valor total= "+ Math.round(preco1 + (mix*precoL))+ " reais");
        }else{
            System.out.println ("Qtd de Galões= "+ 1 );
            System.out.println ("Valor dos Galões= " + preco1 + " reais");
            System.out.println ("Valor total= "+ Math.round(preco1 + (mix3*precoL))+ " reais");
                    }
        
    
        }
//       não me pergunte como fiz, creio que já esqueci, kkkkkk 
      
            
    
       
}
