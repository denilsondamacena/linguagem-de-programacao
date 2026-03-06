/*
Objetivo                    : Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_29_Rendimento
{
    static double ValorInvestido;
    static String Resultado;
    static int TipoInvestimento;

    public static void main(String args[])
    {
        TipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("1- Poupança \n2- Renda Fixa"));

        switch (TipoInvestimento)
        {
            case 1:
                ValorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
                Poupanca();
            break;

            case 2:
                ValorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
                RendaFixa();
            break;
        }

        JOptionPane.showMessageDialog(null, Resultado);
    }

    static void Poupanca()
    {
        double valorCorrigido = ValorInvestido * 1.03;
        Resultado = "Rendimento da poupança após 30 dias: " + valorCorrigido;
    }

    static void RendaFixa()
    {
        double valorCorrigido = ValorInvestido * 1.05;
        Resultado = "Rendimento da renda fixa após 30 dias: " + valorCorrigido;
    }
}