/*
Objetivo                    : Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_25_CalculoDeDuracao
{
    static Integer HoraInicio, MinutoInicio, HoraFinal, MinutoFinal;
    static Integer HoraTotal, MinutoTotal;

    public static void main(String args[])
    {
        HoraInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial:"));
        MinutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial:"));
        HoraFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final:"));
        MinutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final:"));

        CalculoDuracao();

        if (HoraTotal >= 24)
        {
            JOptionPane.showMessageDialog(null, "O tempo máximo de jogo é menor que 24 horas!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Tempo total de jogo: " + HoraTotal + " hora(s) e " + MinutoTotal + " minuto(s)!");
        }
    }

    static void CalculoDuracao()
    {
        HoraTotal = HoraFinal - HoraInicio;
        MinutoTotal = MinutoFinal - MinutoInicio;

        if (MinutoTotal < 0)
        {
            MinutoTotal += 60;
            HoraTotal -= 1;
        }

        if (HoraTotal < 0)
        {
            HoraTotal += 24;
        }
    }
}