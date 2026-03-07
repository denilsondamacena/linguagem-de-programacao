/*
Objetivo                    : Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


import javax.swing.JOptionPane;

public class ModFunc_Lt2_35_SomatoriaDeNumerosImpares
{
    public static void main(String args[])
    {
        int valor1, valor2, aux, soma = 0;
        
        valor1= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        valor2= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo vslor:"));
        
        if (valor1 > valor2)
        {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        
        soma = FuncSomatoriaImpares(valor1, valor2);
        
        System.out.println("O resultado da soma entre os números ímpares entre " + valor1 + " e " + valor2 + " é igual à: " + soma);
    }

    static int FuncSomatoriaImpares(int valor1, int valor2)
    {
        int soma = 0;

        for (int cont = valor1; cont <= valor2; cont++)
        {
            if (cont % 2 != 0)
            {
                soma += cont;
            }
        }

        return soma;
    }
}