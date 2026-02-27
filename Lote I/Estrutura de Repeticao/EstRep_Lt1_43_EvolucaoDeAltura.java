/*
Objetivo                    : Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

public class EstRep_Lt1_43_EvolucaoDeAltura
{
    public static void main(String args[])
    {
        double alturaAna = 1.10, alturaMaria = 1.50;
        int contAno = 0;
        
        do{
            contAno++;
            alturaAna += 0.03;
            alturaMaria += 0.02;
        }while (alturaAna < alturaMaria);
        
        System.out.printf("Levará %d anos para que Ana seja maior que Maria.\nAltura final de Ana: %.2f m", contAno, alturaAna);
    }
}