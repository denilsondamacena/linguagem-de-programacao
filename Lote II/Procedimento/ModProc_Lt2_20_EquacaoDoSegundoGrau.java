/*
Objetivo                    : Receba 3 coeficientes A, B e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_20_EquacaoDoSegundoGrau
{
    static double CoeficienteA, CoeficienteB, CoeficienteC, Delta;
    static String Resultado;
    
    public static void main(String args[])
    {
        CoeficienteA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        CoeficienteB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        CoeficienteC = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C:"));
        
        CalculoDeDelta();
        EquacaoSegundoGrau();
        
        JOptionPane.showMessageDialog(null, Resultado);
    }
    
    static void CalculoDeDelta()
    {
        Delta = (CoeficienteB * CoeficienteB) - (4 * CoeficienteA * CoeficienteC);
    }
    
    static void EquacaoSegundoGrau()
    {
        if (CoeficienteA == 0)
        {
            Resultado = "Não é do segundo grau. Coeficiente A deve ser diferente de zero.";
        }
        else if (Delta > 0)
        {
            double X1 = (-CoeficienteB + Math.sqrt(Delta)) / (2 * CoeficienteA);
            double X2 = (-CoeficienteB - Math.sqrt(Delta)) / (2 * CoeficienteA);
            
            Resultado = "Existem duas raízes reais. X1: " + X1 + " X2: " + X2;
        }
        else if (Delta == 0)
        {
            double X = (-CoeficienteB) / (2 * CoeficienteA);
            
            Resultado = "Existe uma raíz real dupla. X: " + X;
        }
        else
        {
            Resultado = "Delta negativo. Não existem raízes reais.";
        }
    }
}