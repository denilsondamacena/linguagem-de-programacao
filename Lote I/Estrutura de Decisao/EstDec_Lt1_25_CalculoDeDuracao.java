/*
Objetivo                    : Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_25_CalculoDeDuracao
{
    public static void main(String args[])
    {
        
        int HoraInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial:"));
        int MinutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial: "));
        int HoraFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final:"));
        int MinutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final:"));
        
        int MinutoTotal = MinutoFinal - MinutoInicio;
        int HoraTotal = HoraFinal - HoraInicio;
        
        if (MinutoTotal < 0)
        {
            MinutoTotal = (MinutoTotal + 60);
        }
        
        if (HoraTotal < 0)
        {
            HoraTotal = (HoraTotal + 24);
        }
        
        
        if (HoraTotal >= 24)
        {
            JOptionPane.showMessageDialog(null,"O jogo durou menos de 24 horas.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"O jogo durou " + HoraTotal + " horas e " + MinutoTotal + " minutos.");
        } 
    }
}