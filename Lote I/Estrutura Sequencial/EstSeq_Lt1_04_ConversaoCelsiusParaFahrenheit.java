/*
Objetivo                    : Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_04_ConversaoCelsiusParaFahrenheit
{
    public static void main(String args[])
    {
        int temperatura;
        
        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
        JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit: "+(((9 * temperatura)+160)/5)); 
    }
}