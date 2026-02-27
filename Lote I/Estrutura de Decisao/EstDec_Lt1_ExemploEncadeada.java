/*
Objetivo                    : Desenvolva um algoritmo que receba quatro notas bimestrais, calcula e mostra a média aritmética dessas quatro notas, bem como, se o aluno foi aprovado (média >= 7), reprovado (média < 3) ou em exame (média >= 3 e média <7).
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane; 

public class EstDec_Lt1_ExemploEncadeada 
{
    public static void main (String args [])
    {
     
        double n1, n2, n3, n4, media;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
    
        media = (n1 + n2 + n3 + n4) / 4;
    
        JOptionPane.showMessageDialog(null,"A média é: " + media);

        if (media >= 7)
        {
            JOptionPane.showMessageDialog(null,"Aluno aprovado");
        }
        else 
        {
            if (media < 3)
            {
                JOptionPane.showMessageDialog(null,"Aluno reprovado");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Aluno em exame");
            }
        }
    }
}
