/*
Objetivo                    : Quadrado dos números entre 10 e 30.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

public class EstRep_Lt1_ExemploFacaEnquanto {
    public static void main (String args[])
      {
        
        int num= 10, res;
        
        do {
            res = (num * num);
            System.out.println(" O valor é " + num + " o quadrado é " + res);
            num = (num+1); 
        } while ((num>=10) && (num<=30));
     }
}
