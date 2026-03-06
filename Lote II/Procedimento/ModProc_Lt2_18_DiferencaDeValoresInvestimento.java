/*
Objetivo                    : Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_18_DiferencaDeValoresInvestimento
{
    static Integer PrimeiroValor, SegundoValor, DiferencaValor;

    public static void main(String args[])
    {
        PrimeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        SegundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

        DiferencaMaiorPeloMenor();

        JOptionPane.showMessageDialog(null, "A diferença é: " + DiferencaValor);
    }

    static void DiferencaMaiorPeloMenor()
    {
        DiferencaValor = Math.abs(PrimeiroValor - SegundoValor);
    }
}