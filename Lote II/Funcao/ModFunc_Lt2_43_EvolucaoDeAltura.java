/*
Objetivo                    : Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 06/03/2026
*/


public class ModFunc_Lt2_43_EvolucaoDeAltura
{
    public static void main(String args[])
    {
        System.out.printf("Levará %d anos para que Ana seja maior que Maria.", FuncCalcularAnos());
    }

    static int FuncCalcularAnos()
    {
        double alturaAna = 1.10, alturaMaria = 1.50;
        int contAno = 0;

        do{
            contAno++;
            alturaAna += 0.03;
            alturaMaria += 0.02;
        }while (alturaAna < alturaMaria);

        return contAno;
    }
}