/*
Objetivo                    : Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_05_RaizesReais
{
    public static void main(String args[])
    {
        
        int a, b, c;
        double delta;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C:"));
        
        delta = ((Math.pow(b,2))-(4 * a * c));
        
        JOptionPane.showMessageDialog(null, "Existem duas raízes reais: "+((-b)+ Math.sqrt(delta))/(2 * a)+ " e "+(((-b)- Math.sqrt(delta))/(2 * a)));
    }
}