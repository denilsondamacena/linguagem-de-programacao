/*
Objetivo                    : Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
                                1			
                                    4		
                                        16	
                                            64
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 20/03/2026
*/

import javax.swing.JOptionPane;

public class Mat_Lt3_09_MatrizComMultiplicacaoNaDiagonal_Main 
{
    public static void main(String args[]) 
    {
	Mat_Lt3_09_MatrizComMultiplicacaoNaDiagonal_Meth m = new Mat_Lt3_09_MatrizComMultiplicacaoNaDiagonal_Meth();
	int opcao = 0;
	int matriz[][] = new int[4][4];

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Gerar matriz\n2 - Mostrar matriz\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			matriz = m.gerarMatriz(matriz);
			JOptionPane.showMessageDialog(null, "Matriz criada!");
			break;
		case 2:
			m.exibir(matriz);
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