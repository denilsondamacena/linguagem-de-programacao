/*
Objetivo                    : Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_09_SomaDeQuadrados
{
    public static void main(String args[])
    {
        
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        JOptionPane.showMessageDialog(null,"A soma dos quadrados é: "+((n1 * n1)+(n2 * n2)));
    }
}