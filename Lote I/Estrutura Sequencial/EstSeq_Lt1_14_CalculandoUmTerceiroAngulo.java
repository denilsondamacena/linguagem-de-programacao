/*
Objetivo                    : Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_14_CalculandoUmTerceiroAngulo
{
    public static void main(String args[])
    {
        
        int Angulo1, Angulo2;
        
        Angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo:"));
        Angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo ângulo:"));
        
        JOptionPane.showMessageDialog(null, "O terceiro ângulo é igual à: "+(180-(Angulo1 + Angulo2))+"º.");
    }
}