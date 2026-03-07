/*
Objetivo                    : Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


import javax.swing.JOptionPane;

public class ModFunc_Lt2_36_SerieComFatorial
{
    public static void main(String args[])
    {
        int contFat;
        double fat = 1, serie = 1;
        
        int valorN = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
        
        serie = FuncSerie(valorN);
        
        System.out.println("O resultado da série é igual à: " + serie);
    }

    static double FuncSerie(int valorN)
    {
        int contFat;
        double fat = 1, serie = 1;

        for (int cont = 1; cont <= valorN; cont++)
        {
            fat = FuncFatorial(cont);
            serie += (1.0 / fat);
        }

        return serie;
    }

    static double FuncFatorial(int cont)
    {
        int contFat;
        double fat = 1;

        for (contFat = 1; contFat <= cont; contFat++)
        {
            fat *= contFat;
        }

        return fat;
    }
}
