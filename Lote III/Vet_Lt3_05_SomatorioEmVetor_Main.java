/*
Objetivo                    : Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
                                ∑¹ºi=1(A[1]−A[2i−1])
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/03/2026
*/

import javax.swing.JOptionPane;

public class Vet_Lt3_05_SomatorioEmVetor_Main 
{
    public static void main(String args[]) 
    {
	Vet_Lt3_05_SomatorioEmVetor_Meth m = new Vet_Lt3_05_SomatorioEmVetor_Meth();
	int opcao = 0;
	int valores[] = new int[20];
	String resultado = "";

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir números\n2 - Calcular expressão\n3 - Mostrar resultado\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			valores = m.lerValores(valores);
			break;
		case 2:
			resultado = m.calcularExpressao(valores);
			JOptionPane.showMessageDialog(null, "Cálculo concluído!");
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