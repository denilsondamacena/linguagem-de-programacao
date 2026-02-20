/*
Objetivo                    : Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_29_Rendimento
{
    public static void main(String args[])
    {
        int OPC;
        double valor;
        
        OPC = Integer.parseInt(JOptionPane.showInputDialog("1- Poupança \n2- Renda Fixa"));
        
        switch (OPC)
        {
            case 1: valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
                    JOptionPane.showMessageDialog(null,"Rendimento da poupança após 30 dias: "+ (valor * 1.03));
                break;
            case 2: valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
                    JOptionPane.showMessageDialog(null,"Rendimento da renda fixa após 30 dias: "+(valor * 1.05));
                break;           
        }
    }
}