/*
Objetivo                    : Receba um número inteiro. Calcule e mostre o seu fatorial.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

import javax.swing.JOptionPane;

public class EstRep_Lt1_32_Fatorial
{
    public static void main(String args[])
    {
        int valor, fat = 1;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor:"));
        
        if (valor < 0)
        {
            System.out.println("Não existe fatorial de número negativo.");
        }
        else
        {
        for (int cont = 1; cont <= valor; cont++)
        {
            fat *= cont;
        }
        
        System.out.println("O fatorial de " + valor + " é: " + fat);
        }
    }
}