import javax.swing.JOptionPane;

public class Vet_Lt3_07_PesquisaBinariaEmVetor_Meth 
{
    public int[] carregar(int v[]) 
    {
	for (int i = 0; i < 20; i++) 
        {
            v[i] = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o " + (i+1) + "º número:"));
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
    public String pesquisaBinaria(int v[], int chave) 
    {
	int inicio = 0, fim = 19, meio, pos = -1;
	boolean encontrou = false;
	String resp;

	while (inicio <= fim && !encontrou) 
        {
            meio = (inicio + fim) / 2;
            if (v[meio] == chave) 
            {
		encontrou = true;
		pos = meio;
            } 
            else if (chave < v[meio]) 
            {
		fim = meio - 1;
            } 
            else 
            {
		inicio = meio + 1;
            }
	}
	if (encontrou) 
        {
            resp = "Valor encontrado na posição: " + pos;
	} 
        else 
        {
            resp = "Valor não encontrado no vetor.";
	}
	return resp;
    }
    public void exibir(String texto) 
    {
	JOptionPane.showMessageDialog(null, texto);
    }
}