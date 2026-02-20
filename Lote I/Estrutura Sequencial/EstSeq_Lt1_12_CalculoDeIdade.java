/*
Objetivo                    : Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_12_CalculoDeIdade
{
    public static void main(String args[])
    {
        
        int AnoNasc, AnoAtual;
        
        AnoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        AnoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        
        JOptionPane.showMessageDialog(null,"Você tem: "+(AnoAtual - AnoNasc)+" anos e daqui 17 anos terá: "+((AnoAtual - AnoNasc)+17)+ "anos.");
    }
}