/*
Objetivo                    : Carregar códigos das peças em um tabuleiro de xadrez, onde:
                                Código	1	2	3	4	5	6	7
                                Peça	Peão	Torre	Bispo	Cavalo	Rainha	Rei	Vazio
                                Calcular e mostrar a soma das peças do tabuleiro.
                                Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 20/03/2026
*/

import javax.swing.JOptionPane;

public class Mat_Lt3_12_SomaDePecasEmTabuleiroDeXadrez_Main 
{
    public static void main(String args[]) 
    {
	Mat_Lt3_12_SomaDePecasEmTabuleiroDeXadrez_Meth m = new Mat_Lt3_12_SomaDePecasEmTabuleiroDeXadrez_Meth();
	int opcao = 0;
	int matriz[][] = new int[8][8];
	int totais[] = new int[7];

	while (opcao != 9)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir peças\n2 - Contar peças\n3 - Mostrar resultado\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			matriz = m.carregarTabuleiro(matriz, totais);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Contagem realizada!");
			break;
		case 3:
			m.exibir(totais);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Encerrando...");
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
	}
    }
}