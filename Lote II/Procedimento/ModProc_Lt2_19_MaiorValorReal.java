/*
Objetivo                    : Receba 2 valores reais. Calcule e mostre o maior deles.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_19_MaiorValorReal
{
    static double PrimeiroValor, SegundoValor;
    static String Resultado;
    
    public static void main(String args[])
    {
        PrimeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
        SegundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        MaiorValor();
        
        JOptionPane.showMessageDialog(null,Resultado);
    }
    
    static void MaiorValor()
    {
        if (PrimeiroValor > SegundoValor)
        {
            Resultado = PrimeiroValor + " é maior";
        }
        else if (SegundoValor > PrimeiroValor)
        {
            Resultado = SegundoValor + " é maior";
        }
        else
        {
            Resultado = "Os valores são iguais"; 
        }
    }
}