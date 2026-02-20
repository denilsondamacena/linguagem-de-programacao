/*
Objetivo                    : Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EstSeq_Lt1_15_CalculoDeHipotenusa
{
    public static void main(String args[])
    {
        
        int Cateto1, Cateto2;
        
        Cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro cateto:"));
        Cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo cateto:"));
        
        DecimalFormat dc = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é igual à: "+ dc.format(Math.sqrt(Math.pow(Cateto1,2)+ Math.pow(Cateto2,2))));
        
    }
}