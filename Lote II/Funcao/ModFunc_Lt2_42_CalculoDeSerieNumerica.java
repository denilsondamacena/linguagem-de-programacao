/*
Objetivo                    : Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


public class ModFunc_Lt2_42_CalculoDeSerieNumerica
{
    public static void main(String args[])
    {
        int numerador = 2;
        double soma = 1.0;
        
        System.out.println("1");
        
        while (numerador <= 50)
        {
            int denominador = 2 * numerador - 1;
            
            System.out.println(numerador + " / " + denominador);
            
            soma = FuncSerie(soma, numerador, denominador);
            numerador++;
        }
        
        System.out.println("------------------------------");
        System.out.println("O resultado da série é igual à: " + soma);
    }

    static double FuncSerie(double soma, int numerador, int denominador)
    {
        return soma + numerador / (double)denominador;
    }
}
