import javax.swing.JOptionPane;

public class Vet_Lt3_03_ConcatenarVetores_Meth 
{
    public int[] lerPrimeiro(int v[])
    {
	for (int i = 0; i < 3; i++) 
        {
            v[i] = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor do primeiro vetor:"));
	}
        return v;
    }
    public int[] lerSegundo(int v[]) 
    {
        for (int i = 0; i < 3; i++) 
        {
	v[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º valor do segundo vetor:"));
	}
	return v;
    }
    public int[] concatenar(int a[], int b[]) 
    {
	int resultado[] = new int[6];

	for (int i = 0; i < 3; i++) 
        {
            resultado[i] = a[i];
	}
	for (int i = 0; i < 3; i++) 
        {
            resultado[i + 3] = b[i];
	}
	return resultado;
    }

    public void exibir(int v[]) 
    {
	String saida = "Conteúdo do vetor final:\n";

	for (int i = 0; i < 6; i++) 
        {
            saida += v[i] + " ";
	}
	JOptionPane.showMessageDialog(null, saida);
    }
}