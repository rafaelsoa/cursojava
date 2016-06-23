/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.Scanner;

public class numeroprimo {
    
    public static void main(String[] args) {

 Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leitor.nextInt();
        int contador = 0;
//       logica. i inicia no 1 e vai até o numero inserido. qunado o numero 
//        é dividido por i e seu resto é iguala zero
//        conte! 
        for(int i = 1; i <= num;i++){
            if(num%i==0){ 
                
                contador++;
            }          
//    o contador não pode passar de duas vezes, pois, o numero primo so é dividido por ele e por 1
        }
        if(contador==2){
            System.out.println("primo");
        }
        else{
            System.out.println("Nao primo");
        }
    }

}
    

