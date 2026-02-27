/*
Objetivo                    : Receba 2 valores reais. Calcule e mostre o maior deles.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_19_MaiorValorReal
{
    public static void main(String args[])
    {
        
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        if (valor1 > valor2)
        {
            JOptionPane.showMessageDialog(null,"O maior valor é: " + valor1);
        }
        else if (valor2 > valor1)
        {
            JOptionPane.showMessageDialog(null,"O maior valor é: " + valor2);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Os valores são iguais.");
        }
        
        
    }
}