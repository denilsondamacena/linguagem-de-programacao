/*
Objetivo                    : Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_22_OrdemCrescente
{
    public static void main(String args[])
    {
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digie o segundo valor:"));
        
        if (valor1 > valor2)
        {
            JOptionPane.showMessageDialog(null,"Ordem crescente: " + valor2 + " e " + valor1);
        }
        else if (valor2 > valor1)
        {
            JOptionPane.showMessageDialog(null, "Ordem crescente: "+ valor1 + " e " + valor2);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Os valores são iguais: " + valor1 + " e " + valor2);
        }
    }
}