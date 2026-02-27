/*
Objetivo                    : Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_18_DiferencaDeValoresInteiros
{
    public static void main(String args[])
    {
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor:"));
        
        if (valor1 > valor2)
        {
            JOptionPane.showMessageDialog(null,"A diferença é: " + (valor1 - valor2));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"A diferença é: " + (valor2 - valor1));
        }
    }
}