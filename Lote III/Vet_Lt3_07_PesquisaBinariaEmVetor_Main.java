/*
Objetivo                    : A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/03/2026
*/

import javax.swing.JOptionPane;

public class Vet_Lt3_07_PesquisaBinariaEmVetor_Main 
{
    public static void main(String[] args) 
    {
	Vet_Lt3_07_PesquisaBinariaEmVetor_Meth m = new Vet_Lt3_07_PesquisaBinariaEmVetor_Meth();
	int opcao = 0;
	int vetor[] = new int[20];
	int valorBusca = 0;
	String resultado = "";
        
	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir valores\n2 - Ordenar vetor\n3 - Buscar valor\n4 - Mostrar resultado\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			vetor = m.carregar(vetor);
			break;
		case 2:
			vetor = m.ordenar(vetor);
			JOptionPane.showMessageDialog(null, "Vetor ordenado!");
                        break;
		case 3:
			valorBusca = Integer.parseInt(
			JOptionPane.showInputDialog("Digite o valor a ser pesquisado:"));
			resultado = m.pesquisaBinaria(vetor, valorBusca);
			break;
		case 4:
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