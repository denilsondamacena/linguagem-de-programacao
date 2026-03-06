/*
Objetivo                    : Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_22_OrdemCrescente
{
    static String Resultado;
    static Integer PrimeiroValor, SegundoValor;
    
    public static void main(String args[])
    {
        PrimeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        SegundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
       
        VerificarValores();
        Ordenacao();
       
        JOptionPane.showMessageDialog(null, Resultado);
    }
    
    static void VerificarValores()
    {
        if (PrimeiroValor.equals(SegundoValor))
        {
            Resultado = "Os valores devem ser diferentes.";
        }
    }
    
    static void Ordenacao()
    {
        if (!PrimeiroValor.equals(SegundoValor))
        {
            if (PrimeiroValor > SegundoValor)
            {
                Resultado = "Ordem Crescente: " + SegundoValor + " e " + PrimeiroValor;
            }
            else
            {
                Resultado = "Ordem Crescente: " + PrimeiroValor + " e " + SegundoValor;
            }
        }
    }
}