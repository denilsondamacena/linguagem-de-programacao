/*
Objetivo                    : Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


import javax.swing.JOptionPane;

public class ModFunc_Lt2_44_Potencia
{
    public static void main(String args[])
    {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente:"));

        double resultado = FuncPotencia(base, expoente);

        System.out.println(base + " ^ " + expoente + " = " + resultado);
    }

    static double FuncPotencia(int base, int expoente)
    {
        double resultado = 1;

        if (expoente >= 0)
        {
            for (int cont = 1; cont <= expoente; cont++)
            {
                resultado *= base;
            }
        }
        else
        {
            for (int cont = 1; cont <= -expoente; cont++)
            {
                resultado *= base;
            }

            resultado = 1 / resultado;
        }

        return resultado;
    }
}