/*
Objetivo                    : Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

import javax.swing.JOptionPane;

public class EstRep_Lt1_40_NumerosPrimos
{
    public static void main(String args[])
    {
        int aux;
        boolean primo;
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        if ( valor1 >  valor2)
        {
            aux = valor1;
            valor1 = valor2;
            valor2 =  aux;
        }
        for (int cont = valor1; cont <= valor2; cont++)
        {
            if (cont < 2)
            {
                continue;
            }
            
            primo = true;
            
            for (int contPrimo = 2; contPrimo <= Math.sqrt(cont); contPrimo++)
            {
                if (cont % contPrimo == 0)
                {
                    primo = false;
                    break;
                }
            }
            if (primo)
            {
                System.out.println(cont + " é primo");
            }
        }
    }
}