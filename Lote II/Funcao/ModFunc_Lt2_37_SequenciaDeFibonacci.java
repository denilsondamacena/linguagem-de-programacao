/*
Objetivo                    : Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu n-ésimo termo.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


import javax.swing.JOptionPane;

public class ModFunc_Lt2_37_SequenciaDeFibonacci
{
    public static void main(String args[])
    {
        int aux1 = 1, aux2 = 1, fibonacci = 1;
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
        
        if (valor <= 0)
        {
           System.out.println("Informe um número positivo.");
        }
        else
        {
            System.out.print("Sequência: ");
            
            if (valor >= 1)
            {
                System.out.print("1 ");
            }

            for (int cont = 3; cont <= valor; cont++)
            {
                fibonacci = FuncFibonacci(aux1, aux2);
                
                System.out.print(fibonacci + " ");
                
                aux1 = aux2;
                aux2 = fibonacci;
            }
        }
    }

    static int FuncFibonacci(int aux1, int aux2)
    {
        return aux1 + aux2;
    }
}