/*
Objetivo                    : Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


public class ModFunc_Lt2_45_SerieAlternadaComPotencias
{
    public static void main(String args[])
    {
        System.out.print("Série: ");
        double resultado = FuncSerie();
        System.out.println("\nO resultado da série é igual à: " + resultado);
    }

    static double FuncSerie()
    {
        int cont = 1, sinal = 1;
        double soma = 0;

        while(cont <= 15)
        {
            soma += sinal * (cont / (double)(cont * cont));

            if (cont == 1)
                System.out.print(cont + "/" + (cont * cont));
            else
            {
                if (sinal == 1)
                    System.out.print(" + " + cont + "/" + (cont * cont));
                else
                    System.out.print(" - " + cont + "/" + (cont * cont));
            }

            sinal *= -1;
            cont++;
        }

        return soma;
    }
}