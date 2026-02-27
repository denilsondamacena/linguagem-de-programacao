/*
Objetivo                    : Desenvolva um algoritmo que receba um valor numérico real, verifique e mostre se esse número é positivo.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_ExemploSimples
{
    public static void main (String args [])
    {
        double x; 

        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
  
        if (x > 0)
        {
            JOptionPane.showMessageDialog(null,x + " é positivo");
        }
    }
}
