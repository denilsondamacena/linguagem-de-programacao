/*
Objetivo                    : Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
                                a) Se a média for >= 6,0 exibir “APROVADO”; 
                                b) Se a média for >= 3,0 E < 6,0 exibir “EXAME”; 
                                c) Se a média for < 3,0 exibir “RETIDO”.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EstDec_Lt1_21_Media
{
    public static void main(String args[])
    {
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        DecimalFormat df = new DecimalFormat("0.00");
        
        if (media >= 6)
        {
            JOptionPane.showMessageDialog(null,"Média: "+ df.format (media) + " . Aprovado.");
        }
        else if (media >= 3 && media < 6)
        {
            JOptionPane.showMessageDialog(null,"Média: "+ df.format(media) + " . Exame.");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Média: "+ df.format(media) +" . Retido.");
        }
    }
}
