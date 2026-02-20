/*
Objetivo                    : Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_23_DivisivelPor2e3
{
    public static void main(String args[])
    {
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: (maior que o anterior)"));
        int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: (maior que o anterior)"));
        int valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor:"));
        
        if (valor4 >= valor3)
        {
            JOptionPane.showMessageDialog(null,"Ordem crescente: "+ valor1 +", "+valor2+", "+valor3+", "+valor4);
        }
        else if (valor4 >= valor2)
        {
            JOptionPane.showMessageDialog(null,"Ordem crescente: "+ valor1+", "+ valor2 + ", "+ valor4 + ", "+valor3);
        }
        else if (valor4 >= valor1)
        {
            JOptionPane.showMessageDialog(null,"Ordem crescente: "+ valor1 + ", "+valor4 + ", "+ valor2 + ", "+ valor3);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ordem crescente: "+valor4 + ", "+ valor1 + ", "+ valor2 + ", "+ valor3);
        }
            
    }
}
