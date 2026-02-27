/*
Objetivo                    : Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

import javax.swing.JOptionPane;

public class EstRep_Lt1_44_Potencia
{
    public static void main(String args[])
    {
        
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente:"));
        double resultado = 1.0;
        
        if (expoente >= 0)
        {
            for (int cont = 1; cont <= expoente; cont++)
            {
                resultado*= base;
            }
        }
        else
        {
            for (int cont = 1; cont <= expoente; cont++)
            {
                resultado *= base;
            }
            resultado = 1 / resultado;
        }
        
        System.out.println(base + " ^ " + expoente + " = " + resultado);
    }
}