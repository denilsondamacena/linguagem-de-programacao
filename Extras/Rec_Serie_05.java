/*
Objetivo                    : Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 12/03/2026
*/

import javax.swing.JOptionPane;

public class Rec_Serie_05
{
    public static void main(String args[])
    {
        int LimiteSerie;
        LimiteSerie = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        
        JOptionPane.showMessageDialog(null, "O resultado da série 5 é: " + CalcularSerieFatorial(LimiteSerie));
    }
    
    static int CalcularSerieFatorial(int Numero)
    {
        if (Numero == 1)
        {
            return CalcularFatorial(1);
        }
        else
        {
            return CalcularFatorial(Numero) + CalcularSerieFatorial(Numero - 1);
        }
    }
    
    static int CalcularFatorial(int Valor)
    {
        if (Valor == 1)
        {
            return 1;
        }
        else
        {
            return Valor * CalcularFatorial(Valor - 1);
        }
    }
}