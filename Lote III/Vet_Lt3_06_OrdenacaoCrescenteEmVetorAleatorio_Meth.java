import javax.swing.JOptionPane;

public class Vet_Lt3_06_OrdenacaoCrescenteEmVetorAleatorio_Meth 
{
    public int[] gerarValores(int v[]) 
    {
	for (int i = 0; i < 20; i++) 
        {
            v[i] = (int)(Math.random() * 100);
	}
	return v;
    }
    public int[] ordenar(int v[]) 
    {
	int aux;

	for (int i = 0; i < 19; i++) 
        {
            for (int j = 0; j < 19 - i; j++) 
            {
		if (v[j] > v[j + 1]) 
                {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
		}
            }
	}
	return v;
    }
    public void exibir(int v[]) 
    {
	String saida = "Vetor em ordem crescente:\n";

	for (int i = 0; i < 20; i++) 
        {
            saida += v[i] + " ";
	}
            JOptionPane.showMessageDialog(null, saida);
    }
}