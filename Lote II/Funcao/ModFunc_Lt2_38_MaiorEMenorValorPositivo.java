/*
Objetivo                    : Receba 100 números inteiros. Verifique e mostre o maior e o menor valor. Observação: somente valores positivos.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


import javax.swing.JOptionPane;

public class ModFunc_Lt2_38_MaiorEMenorValorPositivo
{
    public static void main(String args[])
    {
        int valor, menorValor = 0, maiorValor = 0;
        
        for (int cont = 1; cont <= 100; cont++)
        {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
            
            if (cont == 1)
            {
                menorValor = valor;
                maiorValor = valor;
            }

            maiorValor = FuncMaior(valor, maiorValor);
            menorValor = FuncMenor(valor, menorValor);
        }
        
        System.out.println("O menor valor é: " + menorValor + " . E o maior valor é: " + maiorValor);
    }

    static int FuncMaior(int valor, int maiorValor)
    {
        if (valor > maiorValor)
        {
            maiorValor = valor;
        }
        return maiorValor;
    }

    static int FuncMenor(int valor, int menorValor)
    {
        if (valor < menorValor)
        {
            menorValor = valor;
        }
        return menorValor;
    }
}