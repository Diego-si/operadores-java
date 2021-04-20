/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Diego
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*float v =8.5f;
        //int ar = (int) Math.floor(v);//arredonda para baixo
        //int ar = (int) Math.ceil(v);//Arredonda para cima
        //int ar = (int) Math.round(v);//Arredonda aparte do meio 
        System.out.println(ar);
        */
        
        double ale = Math.random();//numero aleatorio
        int n = (int) (5 + ale * (10 - 5));//entre 5 e 10
        int m = (int) (15 + ale * (50 - 15));//de 15 ate 50
        System.out.println(n);
        System.out.println(m);
    }
    
}
