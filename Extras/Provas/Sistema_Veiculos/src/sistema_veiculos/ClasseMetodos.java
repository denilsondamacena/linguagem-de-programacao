import java.io.*;

public class ClasseMetodos
{
    public int ler(Veiculo[] vetor)throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("veiculos.txt"));
        
        String linha;
        int i = 0;
        
        while((linha = br.readLine()) != null && i < vetor.length)
        {
            vetor[i] = new Veiculo();
            
            vetor[i].anoFabricacao = Integer.parseInt(linha);
            vetor[i].modelo = br.readLine();
            vetor[i].cor = br.readLine();
            vetor[i].kmPercorrido = Double.parseDouble(br.readLine());
            vetor[i].chassi = Integer.parseInt(br.readLine());
            
            i++;
        }
        
        br.close();
        
        System.out.println("Leitura realizada com sucesso.");
        
        return i;
    }
    
    
    public void ordenar(Veiculo[] vetor, int qtd)
    {
        Veiculo aux;
        
        for(int i = 0; i < qtd - 1; i++)
        {
            for(int j = 0; j < qtd - 1 - i; j++)
            {
                if(vetor[j] != null && vetor[j + 1] != null)
                {
                    if(vetor[j].anoFabricacao < vetor[j + 1].anoFabricacao)
                    {
                        aux = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = aux;
                    }
                    else if(vetor[j].anoFabricacao == vetor[j + 1].anoFabricacao)
                    {
                        if(vetor[j].kmPercorrido > vetor[j + 1].kmPercorrido)
                        {
                            aux = vetor[j];
                            vetor[j] = vetor[j + 1];
                            vetor[j + 1] = aux;
                        }
                    }
                }
            }
        }
    }
    
    
    public int buscaSequencial(Veiculo[] vetor, int alvoProcurado, int indiceAtual, int qtd)
    {
        if(indiceAtual >= qtd)
        {
            return -1;
        }
        
        if(vetor[indiceAtual] != null)
        {
            if(vetor[indiceAtual].chassi == alvoProcurado)
            {
                return indiceAtual;
            }
        }
        
        return buscaSequencial(vetor, alvoProcurado, indiceAtual + 1, qtd);
    }
}