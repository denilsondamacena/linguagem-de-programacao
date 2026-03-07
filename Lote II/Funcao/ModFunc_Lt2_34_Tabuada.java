/*
Objetivo                    : Receba um número. Calcule e mostre os resultados da tabuada desse número.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


import javax.swing.JOptionPane;

public class ModFunc_Lt2_34_Tabuada
{
    public static void main(String args[])
    {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor:"));
        
        System.out.println("Tabuada do "+ valor);
        System.out.println("--------------");
        
        for (int cont = 1; cont <= 10; cont++)
        {
            System.out.println(valor + " x " + cont + " = " + FuncMultiplicacao(cont, valor));
        }
    }

    static int FuncMultiplicacao(int cont, int valor)
    {
        return cont * valor;
    }
}