/*
Objetivo                    : Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

public class EstRep_Lt1_45_SerieAlternadaComPotencias
{
    public static void main(String args[])
    {
        int cont = 1, sinal = 1;
        double soma = 0;
        
        System.out.print("Série: ");
        
        while( cont <= 15)
        {
            soma += sinal * (cont / (double)(cont * cont));
            
            if (cont == 1)
            {
                System.out.print(cont + "/" + (cont * cont));
            }
            else
            {
                if (sinal == 1)
                    System.out.print(" + " + cont + "/" + (cont * cont));
                else
                    System.out.print(" - " + cont + "/" + (cont * cont));
            }
            
            sinal *= -1;
            cont++;
        }
        
        System.out.println();
        System.out.print("O resultado da série é igual à: " + soma);
    }
}