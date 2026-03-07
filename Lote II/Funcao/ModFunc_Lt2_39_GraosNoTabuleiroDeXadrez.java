/*
Objetivo                    : Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
                                Casa	1	2	3	4	...	64
                            Quantidade	1	2	4	8	...	N
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


import java.math.BigInteger;

public class ModFunc_Lt2_39_GraosNoTabuleiroDeXadrez
{
    public static void main(String args[])
    {
        int numeroCasa;
        BigInteger qtdeGraos = BigInteger.ONE;

        for (numeroCasa = 1; numeroCasa <= 64; numeroCasa++)
        {
            System.out.println("Número da casa: " + numeroCasa + " quantidade de grãos: " + qtdeGraos);

            qtdeGraos = FuncGraos(qtdeGraos);
        }
    }

    static BigInteger FuncGraos(BigInteger qtdeGraos)
    {
        return qtdeGraos.multiply(BigInteger.valueOf(2));
    }
}