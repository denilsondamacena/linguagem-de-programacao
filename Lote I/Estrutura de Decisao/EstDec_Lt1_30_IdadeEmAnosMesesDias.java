/*
Objetivo                    : Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/


import javax.swing.JOptionPane;

public class EstDec_Lt1_30_IdadeEmAnosMesesDias
{
    public static void main(String args[])
    {
        int diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia atual: "));
        int mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês atual: "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));

        int diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento: "));
        int mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento: "));
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: "));

        int diferencaDia = diaAtual - diaNasc;
        int diferencaMes = mesAtual - mesNasc;
        int diferencaAno = anoAtual - anoNasc;

        int diasMesAnterior = 0;

        if (diferencaDia < 0)
        {
            mesAtual -= 1;

            if (mesAtual == 2)
            {
                if ((anoAtual % 4 == 0 && anoAtual % 100 != 0) || (anoAtual % 400 == 0))
                {
                    diasMesAnterior = 29;
                }
                else
                {
                    diasMesAnterior = 28;
                }
            }
            else if (mesAtual == 4 || mesAtual == 6 || mesAtual == 9 || mesAtual == 11)
            {
                diasMesAnterior = 30;
            }
            else
            {
                diasMesAnterior = 31;
            }

            diferencaDia += diasMesAnterior;
            diferencaMes -= 1;
        }

        if (diferencaMes < 0)
        {
            diferencaMes += 12;
            diferencaAno -= 1;
        }

        JOptionPane.showMessageDialog(null,"Idade: " + diferencaAno + " anos, " + diferencaMes + " meses e " + diferencaDia + " dias.");
    }
}