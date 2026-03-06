/*
Objetivo                    : Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no salário líquido. Exiba o salário a receber.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_16_CalculoDeSalario
{
    static double HorasTrabalhada;
    static double ValorHora;
    static double PercentualDesconto;
    static int QuantidadeDependentes;
    
    static double SalarioBruto;
    static double Desconto;
    static double SalarioLiquido;

    public static void main(String args[])
    {
        HorasTrabalhada = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
        ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora:"));
        PercentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
        QuantidadeDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes:"));

        CalculoSalario();

        JOptionPane.showMessageDialog(null,"Salário líquido: " + SalarioLiquido);
    }

    static void CalculoSalario()
    {
        SalarioBruto = HorasTrabalhada * ValorHora;
        Desconto = SalarioBruto * (PercentualDesconto / 100);
        SalarioLiquido = SalarioBruto - Desconto + (QuantidadeDependentes * 100);
    }
}