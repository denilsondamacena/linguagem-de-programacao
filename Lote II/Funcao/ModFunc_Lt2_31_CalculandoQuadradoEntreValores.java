/*
Objetivo                    : Calcule e mostre o quadrado dos números entre 10 e 150.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/

public class ModFunc_Lt2_31_CalculandoQuadradoEntreValores
{
    public static void main(String args[])
    {
        for (int cont = 10; cont <= 150; cont++)
        {
            System.out.println("O quadrado de "+ cont + " é = " + FuncQuadrado(cont));
        }
    }

    static int FuncQuadrado(int cont)
    {
        return cont * cont;
    }
}
