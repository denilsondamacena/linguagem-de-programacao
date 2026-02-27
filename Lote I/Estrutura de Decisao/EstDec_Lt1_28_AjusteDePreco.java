/*
Objetivo                    : Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
                                Venda Mensal	Preço Atual	Preço Novo
                                  < 500              < 30          +10%
                              >= 500 e < 1000	>= 30 e < 80	   +15%
                                 >= 1000	>= 80	-5%
                              Observação: para outras condições, preço novo será igual ao preço atual.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_28_AjusteDePreco
{
    public static void main(String args[])
    {
        
        double PrecoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto:"));
        int VendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a média mensal do produto:"));
        
        if (VendaMensal >= 1000 && PrecoAtual >= 80)
        {
            JOptionPane.showMessageDialog(null,"O novo preço do produto é: "+ (PrecoAtual * 0.95));
        }
        else if (VendaMensal >= 500 && VendaMensal < 1000 && PrecoAtual >= 30 && PrecoAtual < 80)
        {
            JOptionPane.showMessageDialog(null, "O novo preço do produto é: "+ (PrecoAtual * 1.15));
        }
        else if (VendaMensal <500 && PrecoAtual <30)
        {
            JOptionPane.showMessageDialog(null,"O novo preço do produto é: "+ (PrecoAtual * 1.10));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "O preço não tem alteração.");
        }
    }
}