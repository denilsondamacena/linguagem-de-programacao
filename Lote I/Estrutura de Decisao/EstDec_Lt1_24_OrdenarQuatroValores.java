/*
Objetivo                    : Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/


import javax.swing.JOptionPane;

public class EstDec_Lt1_24_OrdenarQuatroValores
{
    public static void main(String args[])
    {
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        
        if (valor % 2 == 0  && valor % 3 == 0)
        {
            JOptionPane.showMessageDialog(null,"O número " + valor + " é divisível por 2 e 3.");
        }
        else if (valor % 2 == 0)
        {
            JOptionPane.showMessageDialog(null,"O número " + valor + "é divisível por 2 mas não é por 3.");
        }
        else if (valor % 3 == 0)
        {
            JOptionPane.showMessageDialog(null, "O número "+ valor + " é divisível por 3 mas não é por 2.");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "O número " + valor + " não é divisível por 2 e 3.");
        }
    }
}