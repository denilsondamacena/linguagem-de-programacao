/*
Objetivo                    : Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 12/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_03_AreaDeUmTriangulo
{

    public static void main(String args[])
    {
        int base, altura;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura:"));
        JOptionPane.showMessageDialog(null,"Área do triângulo: "+((base * altura)/2));
    }
}