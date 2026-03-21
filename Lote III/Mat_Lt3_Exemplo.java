/*
Objetivo                    : Ler valores digitados pelo usuário para preencher uma matriz 3x3 e depois exibir esses valores no console.
Programador                 : Ricardo Satoshi
Data de Desenvolvimento     : 19/03/2026
*/

import javax.swing.JOptionPane;

public class Mat_Lt3_Exemplo 
{
    static int M[ ][ ] = new int [3][3];
    static int x,y;
    public static void main(String args [])    
    {
        CarregaMat();
        MostraMat();	
        System.exit(0);
    }
    static void CarregaMat()
    {
	for ( x = 0 ; x < 3 ; x++ )   
        {
	    for ( y = 0 ; y < 3 ; y++)  
            {
                M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));
            }  
        } 
    }
    static void MostraMat()
    {	
    	for ( x = 0 ; x < 3 ; x++ )  
        {
	    for ( y = 0 ; y < 3 ; y++)   
            {
                System.out.println("M[" +x+ "][" +y+ "] = "+M[x][y]);
                 
            }  
        }  
    }  
}
