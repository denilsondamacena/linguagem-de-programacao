/*
Objetivo                    : Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_26_MaiorMultiploDoMenor
{
    public static void main(String args[])
    {
        
        int aux;
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        if (valor2 > valor1)
        {
            aux = valor1;
            valor1 =  valor2;
            valor2 = aux;
        }
        
        if (valor1 % valor2 == 0)
        {
            JOptionPane.showMessageDialog(null,"O número "+ valor1 + " é múltiplo de "+ valor2);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "O número "+ valor1 + " não é múltiplo de "+ valor2);
        }
    }
}