/*
Objetivo                    : Criar uma matriz [8][8] onde o programa irá carregar segundo:
                                casa	1	2	3	4	...	
                                valor	1	2	4	8	...	Exibir soma dos valores
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 20/03/2026
*/

import javax.swing.JOptionPane;

public class Mat_Lt3_10_MatrizComPotencia_Main 
{
    public static void main(String args[]) 
    {
	Mat_Lt3_10_MatrizComPotencia_Meth m = new Mat_Lt3_10_MatrizComPotencia_Meth();
	int opcao = 0;
	long matriz[][] = new long[8][8];
	long soma = 0;

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Gerar matriz\n2 - Mostrar matriz\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
                        matriz = m.gerarMatriz(matriz);
			soma = m.calcularSoma(matriz);
			JOptionPane.showMessageDialog(null, "Matriz preenchida!");
			break;
		case 2:
			m.exibir(matriz, soma);
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