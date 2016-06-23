import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
 
public class questao7 {
 
    /**
     * @param args
     * @throws IOException 
     * @throws NumberFormatException 
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numeros = new ArrayList<>();
        int n = -1;
         
        do{
        System.out.print("Digite o número (-1 para mostrar o maior número): ");     
        n = Integer.parseInt(rd.readLine());
         
        if (n == -1){
            System.out.println("Maior numero é: "+retornaMaiorValor(numeros));
        }else{
            numeros.add(n);
        }
         
        }while(n != -1);

    private static String retornaMaiorValor(List<Integer> numeros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
