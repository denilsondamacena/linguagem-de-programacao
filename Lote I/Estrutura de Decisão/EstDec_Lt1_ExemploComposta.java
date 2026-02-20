/*
Objetivo                    : Desenvolva um algoritmo que receba três valores numéricos inteiros, mostre a soma desses três números, verifique e mostre se a soma é maior que 100.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_ExemploComposta
{
    public static void main (String args [])
    {

        int num1, num2, num3, soma; 

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

        soma = num1 + num2 + num3;

        JOptionPane.showMessageDialog(null,"A soma dos três valores digitados é: " + soma);
        
        if (soma > 100)
        {
            JOptionPane.showMessageDialog(null,"A soma é maior que 100");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"A soma é menor ou igual a 100");
        }
    }
}
