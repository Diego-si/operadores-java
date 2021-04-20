/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Diego
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,a,b,c,d,e,r;
        n1 =14;
        n2 =8;
        a=(n1>n2)?n1:n2;
        b=(n1<n2)?n1:n2;
        c=(n1>=n2)?n2+n1:n1-n2;
        d=(n1<=n2)?n2:n1+n2;
        e =(n1==n2)?n1+n2:1;
        r=(n1!=n2)?5:3-1;
        System.out.println(" a " + a);
        System.out.println(" b " + b);
        System.out.println(" c " + c);
        System.out.println(" d " + d);
        System.out.println(" e " + e);
        System.out.println(" r " + r);
        
    }
    
}
