/*
Objetivo                    : Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostrar os dados.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/03/2026
*/

import javax.swing.JOptionPane;

public class Vet_Lt3_06_OrdenacaoCrescenteEmVetorAleatorio_Main
{
    public static void main(String args[]) 
    {
	Vet_Lt3_06_OrdenacaoCrescenteEmVetorAleatorio_Meth m = new Vet_Lt3_06_OrdenacaoCrescenteEmVetorAleatorio_Meth();
	int opcao = 0;
	int vetor[] = new int[20];

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Gerar números\n2 - Ordenar vetor\n3 - Mostrar vetor\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
                        vetor = m.gerarValores(vetor);
			break;
		case 2:
			vetor = m.ordenar(vetor);
			JOptionPane.showMessageDialog(null, "Vetor ordenado!");
			break;
		case 3:
			m.exibir(vetor);
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