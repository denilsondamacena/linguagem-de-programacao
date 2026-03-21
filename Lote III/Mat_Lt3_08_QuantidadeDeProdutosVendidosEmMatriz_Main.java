/*
Objetivo                    : Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
                                a) A quantidade de cada produto vendido no mês;
                                b) A quantidade de produtos vendidos por semana;
                                c) O total de produtos vendidos no mês.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 20/03/2026
*/

import javax.swing.JOptionPane;

public class Mat_Lt3_08_QuantidadeDeProdutosVendidosEmMatriz_Main 
{
    public static void main(String args[]) 
    {
	Mat_Lt3_08_QuantidadeDeProdutosVendidosEmMatriz_Meth m = new Mat_Lt3_08_QuantidadeDeProdutosVendidosEmMatriz_Meth();
	int opcao = 0;
	int matriz[][] = new int[4][3];
	String resultado = "";

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir dados\n2 - Calcular totais\n3 - Mostrar resultado\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			matriz = m.carregarDados(matriz);
			break;
		case 2:
			resultado = m.calcularTotais(matriz);
			JOptionPane.showMessageDialog(null, "Cálculo realizado!");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, resultado);
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