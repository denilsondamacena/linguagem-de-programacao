/*
Objetivo                    : Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

import javax.swing.JOptionPane;

public class EstRep_Lt1_33_CalculoDeSerieHarmonica
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
            for (int cont = 1; cont <= valor; cont++)
            {
                serie += (1.0 / cont);
            }
        
            System.out.println("O resultado da série é: " + serie);
        }
    }
}    