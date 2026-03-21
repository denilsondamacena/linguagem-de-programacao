/*
Objetivo                    : Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
                                1	1	1	1	1	1	1	1
                                1	2	2	2	2	2	2	1
                                1	2	3	3	3	3	2	1
                                1	2	3	4	4	3	2	1
                                1	2	3	4	4	3	2	1
                                1	2	3	3	3	3	2	1
                                1	2	2	2	2	2	2	1
                                1	1	1	1	1	1	1	1
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 20/03/2026
*/

import javax.swing.JOptionPane;

public class Mat_Lt3_11_MatrizEmCaracol_Main 
{
    public static void main(String[] args) 
    {
	Mat_Lt3_11_MatrizEmCaracol_Meth m = new Mat_Lt3_11_MatrizEmCaracol_Meth();
	int opcao = 0;
	int matriz[][] = new int[8][8];

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Gerar matriz\n2 - Mostrar matriz\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			matriz = m.gerarPadrao(matriz);
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