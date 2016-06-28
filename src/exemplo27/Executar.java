/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo27;

import java.util.Scanner;

/**
 *
 * @author a965866
 */
public class Executar {
    public static void main(String[] args) {
       
      Marca marca = new Marca (1,"Honda");
      Modelo modelo = new Modelo(1, "Civic", marca);
      Carro carro = new Carro (1, modelo, "XYZ-9999", 2010, 22000);
      
      System.out.println (carro); 
      
        
    }
}
