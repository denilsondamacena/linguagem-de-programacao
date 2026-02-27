/*
Objetivo                    : Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

public class EstRep_Lt1_41_CombinacoesDeDadosComSoma7
{
    public static void main(String args[])
    {
        int dado1, dado2;
        
        for (dado1 = 1; dado1 <= 6; dado1++)
        {
            for (dado2 = 1; dado2 <= 6; dado2++)
            {
                if (dado1 + dado2 == 7)
                {
                    System.out.println(dado1 + " + " + dado2 + " = 7");
                }
            }
        }
    }
}
