/*
Objetivo                    : Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 12/03/2026
*/

import javax.swing.JOptionPane;

public class Rec_Serie_04
{
    public static void main(String args[])
    {
        double LimiteSerie;
        LimiteSerie = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        
        JOptionPane.showMessageDialog(null, "O resultado da série 4 é: " + CalcularSerie(LimiteSerie, 1));
    }
    
    static double CalcularSerie(double Limite, double Divisor)
    {
        if (Divisor == Limite)
        {
            return (Limite - Divisor + 1) * 1.0 / Divisor;
        }
        else
        {
            return ((Limite - Divisor + 1) * 1.0 / Divisor) + CalcularSerie(Limite, Divisor + 1);
        }
    }
}