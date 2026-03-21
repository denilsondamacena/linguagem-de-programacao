/*
Objetivo                    : Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
                                Exemplo:
                                    VT1	1	2	3
                                    VT2	4	5	6
                                    VT3	1	2	3	4	5	6
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/03/2026
*/

import javax.swing.JOptionPane;

public class Vet_Lt3_03_ConcatenarVetores_Main 
{
    public static void main(String args[]) 
    {
	Vet_Lt3_03_ConcatenarVetores_Meth m = new Vet_Lt3_03_ConcatenarVetores_Meth();
	int opcao = 0;
	int vet1[] = new int[3];
	int vet2[] = new int[3];
	int vet3[] = new int[6];

	while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Preencher Vetores\n2 - Unir Vetores\n3 - Mostrar Resultado\n9 - Sair"));
            switch (opcao) 
            {
		case 1:
			vet1 = m.lerPrimeiro(vet1);
			vet2 = m.lerSegundo(vet2);
			break;
		case 2:
			vet3 = m.concatenar(vet1, vet2);
			JOptionPane.showMessageDialog(null, "Vetores combinados!");
			break;
		case 3:
			m.exibir(vet3);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Finalizado.");
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
	}
    }
}