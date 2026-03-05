/*
Objetivo                    : Quadrado dos números entre 10 e 30.
Programador                 : Ricardo Satoshi
Data de Desenvolvimento     : 19/02/2026
*/

public class EstRep_Lt1_ExemploEnquanto {
    public static void main (String args[])
      {
          
        int num= 10, res;
        
        while ((num>=10) && (num<=30))
           {
            res = (num * num);
            System.out.println(" O valor é " + num + " o quadrado é " + res);
            num = (num+1);
          }
     }
}
