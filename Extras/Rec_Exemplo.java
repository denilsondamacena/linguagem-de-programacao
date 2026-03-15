/*
Objetivo                    : Série de fatorial
Programador                 : Ricardo Satoshi
Data de Desenvolvimento     : 12/03/2026
*/

import javax.swing.JOptionPane;

public class Rec_Exemplo
{
    public static void main(String args[])
    {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        
        JOptionPane.showMessageDialog(null,"O resultado da série exemplo é: " + FFAT(num));
    }


    static int FFAT(int N)
    {
        int Fat;

         if (N > 1)
        {
            Fat = N * FFAT(N - 1);
            return Fat;
        }
        else
        {
            return 1;
        }
    }
}


