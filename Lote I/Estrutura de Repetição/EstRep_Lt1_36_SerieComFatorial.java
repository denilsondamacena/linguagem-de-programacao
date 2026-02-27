/*
Objetivo                    : Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/


import javax.swing.JOptionPane;

public class EstRep_Lt1_36_SerieComFatorial
{
    public static void main(String args[])
    {
        int contFat;
        double fat = 1, serie = 1;
        
        int valorN = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
        
        for (int cont = 1; cont <= valorN; cont++)
        {
            for (contFat = 1; contFat <= cont; contFat++)
            {
                fat*=contFat;
            }
            serie +=(1.0 / fat);
            fat = 1;
        }
        
        System.out.println("O resultado da série é igual à: " + serie);
    }
}