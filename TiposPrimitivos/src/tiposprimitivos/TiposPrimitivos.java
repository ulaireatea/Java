/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); //ou colocando typecast na frente: float nota = (float) 8.5;
        //System.out.println("A nota é " + nota);
        //System.out.printf("A nota de %s é %.2f \n", nome, nota); // \n para quebrar linha
        System.out.format("Sua nota é %.1f \n", nota); // outra alternativa de escrita
    }
    
}
