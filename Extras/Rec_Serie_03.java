/*
Objetivo                    : Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 12/03/2026
*/

import javax.swing.JOptionPane;

public class Rec_Serie_03
{
    public static void main(String args[])
    {
        int LimiteSerie;
        LimiteSerie = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        
        JOptionPane.showMessageDialog(null, "O resultado da série 3 é: " + CalcularSerie(LimiteSerie));
    }
    
    static double CalcularSerie(int TermoAtual)
    {
       if (TermoAtual == 1)
       {
           return 1.0;
        }
        else
        {
            return (1.0 / TermoAtual) + CalcularSerie(TermoAtual - 1);
        }
    }
}