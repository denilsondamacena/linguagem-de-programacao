/*
Objetivo                    : Receba um número. Calcule e mostre os resultados da tabuada desse número.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

import javax.swing.JOptionPane;

public class EstRep_Lt1_34_Tabuada
{
    public static void main(String args[])
    {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor:"));
        
        System.out.println("Tabuada do "+ valor);
        System.out.println("--------------");
        
        for (int cont = 1; cont <= 10; cont++)
        {
            System.out.println(valor + " x " + cont + " = " + (cont*valor));
        }
    }
}
