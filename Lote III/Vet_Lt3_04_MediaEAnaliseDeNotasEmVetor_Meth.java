import javax.swing.JOptionPane;

public class Vet_Lt3_04_MediaEAnaliseDeNotasEmVetor_Meth 
{
    public double[] carregarNotas(double v[]) 
    {
	for (int i = 0; i < 30; i++) 
        {
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i+1) + "ª nota:"));
	}
	return v;
    }
    public String processarNotas(double v[]) 
    {
	double soma = 0, media;
	int acima = 0;
	String resp = "Índices com valores abaixo da média:\n";

	for (int i = 0; i < 30; i++) 
        {
            soma += v[i];
	}

	media = soma / 30;

	for (int i = 0; i < 30; i++) 
        {
            if (v[i] > media) 
            {
		acima++;
            }
	}
	for (int i = 0; i < 30; i++) 
        {
            if (v[i] < media) 
            {
		resp += i + " ";
            }
	}
	resp += "\n\nMédia calculada: " + media + "\nQuantidade acima da média: " + acima;
	return resp;
    }
    public void exibir(String texto) 
    {
	JOptionPane.showMessageDialog(null, texto);
    }
}