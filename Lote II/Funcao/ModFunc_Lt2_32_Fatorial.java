/*
Objetivo                    : Receba um número inteiro. Calcule e mostre o seu fatorial.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


import javax.swing.JOptionPane;

public class ModFunc_Lt2_32_Fatorial
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
            fat = FuncFatorial(valor);
            System.out.println("O fatorial de " + valor + " é: " + fat);
        }
    }

    static int FuncFatorial(int valor)
    {
        int fat = 1;

        for (int cont = 1; cont <= valor; cont++)
        {
            fat *= cont;
        }

        return fat;
    }
}