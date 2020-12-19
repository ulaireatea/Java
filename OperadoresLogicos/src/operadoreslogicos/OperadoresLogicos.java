/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author marcelo
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r, b, g;
        r = (x<y && y<z)?true:false;  //operador logico .E.
        b = (x>y || y==z)?true:false; //oeprador logico .OU.
        g = (x<y ^ y<z)?true:false;  //operador logico .XOU. (uma ou a outra)
        System.out.println(r);
        System.out.println(b); 
        System.out.println(g);
    }
    
}
