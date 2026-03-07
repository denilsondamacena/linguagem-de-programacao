/*
Objetivo                    : Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


public class ModFunc_Lt2_41_CombinacoesDeDadosComSoma7
{
    public static void main(String args[])
    {
        int dado1, dado2;
        
        for (dado1 = 1; dado1 <= 6; dado1++)
        {
            for (dado2 = 1; dado2 <= 6; dado2++)
            {
                if (FuncSoma7(dado1, dado2))
                {
                    System.out.println(dado1 + " + " + dado2 + " = 7");
                }
            }
        }
    }

    static boolean FuncSoma7(int dado1, int dado2)
    {
        return (dado1 + dado2 == 7);
    }
}