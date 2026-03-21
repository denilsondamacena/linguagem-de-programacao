/*
Objetivo                    : Criar e coletar um vetor [100] inteiro e exibir:
                                a) O maior e o menor valor;
                                b) A média dos valores.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/03/2026
*/

import javax.swing.JOptionPane;

public class Vet_Lt3_02_MaiorMenorEMediaEmVetor_Main 
{
    public static void main(String args[]) 
    {
	Vet_Lt3_02_MaiorMenorEMediaEmVetor_Meth m = new Vet_Lt3_02_MaiorMenorEMediaEmVetor_Meth();
	int opcao = 0;
	int numeros[] = new int[100];
	String resultado = "";

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir números\n2 - Processar dados\n3 - Mostrar resultado\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			numeros = m.carregarDados(numeros);
			break;
		case 2:
			resultado = m.calcularInformacoes(numeros);
			JOptionPane.showMessageDialog(null, "Processamento concluído!");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, resultado);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Encerrando aplicação...");
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
	}
    }
}