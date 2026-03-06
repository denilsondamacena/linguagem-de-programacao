/*
Objetivo                    : Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_26_MaiorMultiploDoMenor
{
    static Integer PrimeiroValor, SegundoValor;
    static String Resultado;

    public static void main(String args[])
    {
        PrimeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        SegundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

        Ordenacao();
        Multiplo();

        JOptionPane.showMessageDialog(null, Resultado);
    }

    static void Ordenacao()
    {
        int aux;

        if (SegundoValor > PrimeiroValor)
        {
            aux = PrimeiroValor;
            PrimeiroValor = SegundoValor;
            SegundoValor = aux;
        }
    }

    static void Multiplo()
    {
        if (SegundoValor == 0)
        {
            Resultado = "Não é possível verificar múltiplo com divisor zero.";
        }
        else if (PrimeiroValor % SegundoValor == 0)
        {
            Resultado = PrimeiroValor + " é múltiplo de " + SegundoValor + ".";
        }
        else
        {
            Resultado = PrimeiroValor + " não é múltiplo de " + SegundoValor + ".";
        }
    }
}