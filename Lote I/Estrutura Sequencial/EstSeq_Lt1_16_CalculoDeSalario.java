/*
Objetivo                    : Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no salário líquido. Exiba o salário a receber.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EstSeq_Lt1_16_CalculoDeSalario
{
    public static void main(String args[])
    {
        
        int HorasTrabalhada, QuantidadeDependentes;
        double PercentualDesconto, ValorHora;
        
        HorasTrabalhada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
        ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora:"));
        PercentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
        QuantidadeDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes:"));
        
        DecimalFormat dc = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null,"Salário líquido é igual à: R$"+(((HorasTrabalhada * ValorHora) * ((100 - PercentualDesconto)/100))+(QuantidadeDependentes*100)));
    }
}