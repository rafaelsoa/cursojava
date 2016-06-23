//Faça um programa que leia e valide as seguintes informações:
//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
//Salário: maior que zero;
//Sexo: 'f' ou 'm';
//Estado Civil: 's', 'c', 'v', 'd';
package lista5;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nome = "nome" ;
        int idade = 1;
        float salario = 1;
        String sexo= "Feme";
        String estCivil = "sol";
        
        do{
            System.out.println ("Informe seu Nome!");
            nome = entrada.next();
            
        } while (nome.length()<3);
        do{
            System.out.println ("Informe sua idade!");
            idade= entrada.nextInt();
        } while (idade <0 &&
               idade>150);   
        do{    
            System.out.println ("Informe seu salario!");
            salario = entrada.nextFloat();
        }while (salario <0);
        
        do{
            System.out.println ("Informe seu sexo!");
            sexo = entrada.next();
        }while( !sexo.equalsIgnoreCase("M")&& !sexo.equalsIgnoreCase("F"));
        
        do{
            System.out.println ("Informe seu estado Civil!");
            estCivil = entrada.next();
        } while (!estCivil.equalsIgnoreCase("s")&& !estCivil.equalsIgnoreCase("c")
                && !estCivil.equalsIgnoreCase("v")&& !estCivil.equalsIgnoreCase("d"));
}
    
}
