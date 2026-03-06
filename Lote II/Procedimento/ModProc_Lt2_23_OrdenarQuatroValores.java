/*
Objetivo                    : Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_23_OrdenarQuatroValores
{
    static Integer PrimeiroValor, SegundoValor, TerceiroValor, QuartoValor;
    static String Resultado;
    
    public static void main(String args[])
    {
        PrimeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        SegundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: (maior que o anterior)"));
        TerceiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: (maior que o anterior)"));
        QuartoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor:"));
        
        OrdemCrescente();
        
        JOptionPane.showMessageDialog(null, Resultado);
    }
    
    static void OrdemCrescente()
    {
        if (QuartoValor >= TerceiroValor)
        {
            Resultado = "Em ordem crescente:\n" + PrimeiroValor + ", " + SegundoValor + ", " + TerceiroValor + ", " + QuartoValor + ".";
        }
        else if (QuartoValor >= SegundoValor)
        {
            Resultado = "Em ordem crescente:\n" + PrimeiroValor + ", " + SegundoValor + ", " + QuartoValor + ", " + TerceiroValor + ".";
        }
        else if (QuartoValor >= PrimeiroValor)
        {
            Resultado = "Em ordem crescente:\n" + PrimeiroValor + ", " + QuartoValor + ", " + SegundoValor + ", " + TerceiroValor + ".";
        }
        else
        {
            Resultado = "Em ordem crescente:\n" + QuartoValor + ", " + PrimeiroValor + ", " + SegundoValor + ", " + TerceiroValor + ".";
        }
    }
}