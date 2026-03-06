/*
Objetivo                    : Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
                                Venda Mensal	Preço Atual	Preço Novo
                                  < 500              < 30          +10%
                              >= 500 e < 1000	>= 30 e < 80	   +15%
                                 >= 1000	        >= 80	       -5%
                              Observação: para outras condições, preço novo será igual ao preço atual.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_28_AjusteDePreco
{
    static double PrecoAtual;
    static Integer MediaMensal;
    static String Resutado;

    public static void main(String args[])
    {
        PrecoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual do produto:"));
        MediaMensal = Integer.parseInt(JOptionPane.showInputDialog("Informe a média de venda mensal do produto: "));

        NovoPreco();

        JOptionPane.showMessageDialog(null, Resutado);
    }

    static void NovoPreco()
    {
        double novoPreco;

        if (MediaMensal >= 1000 && PrecoAtual >= 80)
        {
            novoPreco = PrecoAtual * 0.95;
            Resutado = "O novo preço é " + novoPreco + "!";
        }
        else if (MediaMensal >= 500 && MediaMensal < 1000 && PrecoAtual >= 30 && PrecoAtual < 80)
        {
            novoPreco = PrecoAtual * 1.15;
            Resutado = "O novo preço é " + novoPreco + "!";
        }
        else if (MediaMensal < 500 && PrecoAtual < 30)
        {
            novoPreco = PrecoAtual * 1.10;
            Resutado = "O novo preço é " + novoPreco + "!";
        }
        else
        {
            Resutado = "Não houve alteração do preço!";
        }
    }
}