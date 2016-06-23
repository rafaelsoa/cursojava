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
public class questao8 {
    public static void main(String[] args) {
         Scanner soa = new Scanner(System.in);

        double tamanho, velocidade, tamaBits,veloBits, velo1, veloSeg, veloMin;
        int minParte;
        System.out.println("Digite o tamanho do arquivo em (MB): ");
        tamanho = soa.nextDouble();
        System.out.println("Digite a velocidade de Download em Mbps: ");
        velocidade = soa.nextDouble();
        tamaBits = tamanho * 8.388608;
        veloBits = velocidade / 1000;
        velo1 = tamaBits / veloBits;
        veloMin = velo1 / 60; 
        minParte = (int)veloMin;
        veloSeg = velo1 % 60;
        System.out.println("O tempo aproximado do Download é: "+ minParte+" "
                + "minutos ");
    }
}
