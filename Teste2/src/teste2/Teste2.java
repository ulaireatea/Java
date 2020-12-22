/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste2;

/**
 *
 * @author marcelo
 */
public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int a = 0;
        while (i<10) {
            ++a;
            i = i + 1;
            if (a>6) ++i;
        }
        System.out.println(i);
        System.out.println(a);
    }
}
