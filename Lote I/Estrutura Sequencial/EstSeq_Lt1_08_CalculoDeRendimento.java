/*
Objetivo                    : Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EstSeq_Lt1_08_CalculoDeRendimento
{
    public static void main(String args[])
    {
        
        double deposito;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null,"Valor após um mês de aplicação na poupança: "+df.format(deposito * 1.013));
    }
}