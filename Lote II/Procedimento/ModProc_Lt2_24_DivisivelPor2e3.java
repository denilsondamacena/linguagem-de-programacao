/*
Objetivo                    : Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_24_DivisivelPor2e3
{
    static Integer ValorEntrada;
    static String Resultado;
    
    public static void main(String args[])
    {
        ValorEntrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        
        DivisivelPor2();
        DivisivelPor3();
        
        JOptionPane.showMessageDialog(null, Resultado);
    }
    
    static void DivisivelPor2()
    {
        if (ValorEntrada % 2 == 0)
        {
            Resultado = ValorEntrada + " é divisível por 2 e ";
        }
        else
        {
            Resultado = ValorEntrada + " não é divisível por 2 e ";
        }
    }
    
    static void DivisivelPor3()
    {
        if (ValorEntrada % 3 == 0)
        {
            Resultado += "divisível por 3.";
        }
        else
        {
            Resultado += "não divisível por 3.";
        }
    }
}
    