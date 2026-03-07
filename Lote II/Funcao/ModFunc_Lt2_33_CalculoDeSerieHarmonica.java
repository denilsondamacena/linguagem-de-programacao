/*
Objetivo                    : Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/

import javax.swing.JOptionPane;

public class ModFunc_Lt2_33_CalculoDeSerieHarmonica
{
    public static void main(String args[])
    {
        double serie = 0;
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor:"));
        
        if (valor <= 0)
        {
            System.out.println("Informe um número inteiro positivo maior que zero.");
        }
        else
        {
            serie = FuncSerie(valor);
            System.out.println("O resultado da série é: " + serie);
        }
    }

    static double FuncSerie(int valor)
    {
        double serie = 0;

        for (int cont = 1; cont <= valor; cont++)
        {
            serie += (1.0 / cont);
        }

        return serie;
    }
}