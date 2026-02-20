/*
Objetivo                    : Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EstSeq_Lt1_11_ComprimentoDeCircunferencia
{
    public static void main(String args[])
    {
        
        double raio;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circuferência:"));
        DecimalFormat dc = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null,"O comprimento da circuferência é: "+dc.format(2* Math.PI * raio));
    }
}
