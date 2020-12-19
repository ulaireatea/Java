/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author marcelo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String nome1 = "Marcelo";
        String nome2 = "Marcelo";
        String nome3 = new String("Marcelo");
        String res;
        res = (nome1==nome2)?"igual":"diferente";   //neste formato de def. o resultado será igual
        System.out.println(res);*/ 
        
        String nome2 = "Marcelo";
        String nome3 = new String("Marcelo");
        String res;
        res = (nome2.equals(nome3)) ? "igual":"diferente"; // neste formato é possível igualar o CONTEUDO mesmo com o instanciamento usando a clausula NEW
        System.out.println(res);
                
    }
    
}
