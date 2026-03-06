/*
Objetivo                    : Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
                                a) Se a média for >= 6,0 exibir “APROVADO”; 
                                b) Se a média for >= 3,0 E < 6,0 exibir “EXAME”; 
                                c) Se a média for < 3,0 exibir “RETIDO”.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_21_Media
{
    static double Nota1, Nota2, Nota3, Nota4;
    static double Media;
    static String Resultado;
    
    public static void main(String args[])
    {
        Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª nota: "));
        Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª nota: "));
        Nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3ª nota: "));
        Nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4ª nota: "));
        
        CalculoMedia();
        ResultadoAluno();
        
        JOptionPane.showMessageDialog(null,"Média: " + Media + "\nSituação: " + Resultado);
    }
    
    static void CalculoMedia()
    {
        Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
    }
    
    static void ResultadoAluno()
    {
        if (Media >= 6)
        {
            Resultado = "Aprovado";
        }
        else if (Media >= 3)
        {
            Resultado = "Exame";
        }
        else
        {
            Resultado = "Retido";
        }
    }
}