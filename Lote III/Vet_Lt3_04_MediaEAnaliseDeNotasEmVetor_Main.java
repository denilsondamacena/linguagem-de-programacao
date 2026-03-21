/*
Objetivo                    : Criar e coletar em um vetor [30] real e calcular e exibir:
                                a) A média do grupo;
                                b) A quantidade de notas acima do grupo;
                                c) As posições dos valores abaixo da média do grupo.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/03/2026
*/

import javax.swing.JOptionPane;

public class Vet_Lt3_04_MediaEAnaliseDeNotasEmVetor_Main 
{
    public static void main(String args[]) 
    {
	Vet_Lt3_04_MediaEAnaliseDeNotasEmVetor_Meth m = new Vet_Lt3_04_MediaEAnaliseDeNotasEmVetor_Meth();
	int opcao = 0;
	double valores[] = new double[30];
	String resultado = "";

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir notas\n2 - Calcular dados\n3 - Mostrar resultado\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			valores = m.carregarNotas(valores);
			break;
		case 2:
			resultado = m.processarNotas(valores);
			JOptionPane.showMessageDialog(null, "Cálculo realizado!");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, resultado);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Encerrando programa...");
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
	}
    }
}