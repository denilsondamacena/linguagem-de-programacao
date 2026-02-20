/*
Objetivo                    : Receba 2 números reais. Calcule e mostre a diferença desses valores.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_10_DiferencaDeValores
{
    public static void main(String args[])
    {
        
        double n1, n2;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        JOptionPane.showMessageDialog(null, "A diferença é: "+(n1 - n2));
        
    }
}