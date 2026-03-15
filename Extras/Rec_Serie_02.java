/*
Objetivo                    : Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 12/03/2026
*/

import javax.swing.JOptionPane;

public class Rec_Serie_02
{
    public static void main(String args[])
    {
        int NumeroInicial;
        NumeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        
        JOptionPane.showMessageDialog(null, "O resultado da série 2 é: " + CalcularSoma(NumeroInicial));
    }
    
    static int CalcularSoma(int Numero)
    {
        if (Numero == 1)
        {
            return 1;
        }
        else
        {
            return Numero + CalcularSoma(Numero - 1);
        }
    }
}