import javax.swing.JOptionPane;

public class Vet_Lt3_02_MaiorMenorEMediaEmVetor_Meth 
{
    public int[] carregarDados(int v[]) 
    {
	for (int i = 0; i < 100; i++) 
        {
            v[i] = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor:"));
	}
	return v;
    }
    public String calcularInformacoes(int v[]) 
    {
	int maior, menor, soma = 0;
	double media;
	String resp;

	maior = v[0];
	menor = v[0];
	soma = v[0];

	for (int i = 1; i < 100; i++) 
        {
            soma += v[i];
            if (v[i] > maior) 
            {
                maior = v[i];
            }
            if (v[i] < menor) 
            {
                menor = v[i];
            }
	}
	media = soma / (100 * 1.0);
	resp = "Maior valor encontrado: " + maior + "\nMenor valor encontrado: " + menor + "\nMédia dos valores informados: " + media;
	return resp;
    }
    public void exibir(String texto) 
    {
	JOptionPane.showMessageDialog(null, texto);
    }
}