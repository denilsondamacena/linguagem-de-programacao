/*
Objetivo                    : Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
                                Casa	1	2	3	4	...	64
                            Quantidade	1	2	4	8	...	N
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

import java.math.BigInteger;

public class EstRep_Lt1_39_GraosNoTabuleiroDeXadrez
{
    public static void main(String args[])
    {
       int numeroCasa;
       BigInteger qtdeGraos = BigInteger.ONE;
       
       for (numeroCasa = 1; numeroCasa <= 64; numeroCasa++)
       {
           System.out.println("Número da casa: " + numeroCasa + " quantidade de grãos: " + qtdeGraos);
           
           qtdeGraos = qtdeGraos.multiply(BigInteger.valueOf(2));
       }
    }
}