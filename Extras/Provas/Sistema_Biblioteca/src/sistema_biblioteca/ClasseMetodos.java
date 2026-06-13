import java.io.*;

public class ClasseMetodos
{
    public int ler(Livro[] vetor, int qtd)throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("livros.txt"));
        String linha;
        int i = 0;
        
        while((linha = br.readLine()) != null && i < qtd)
        {
            vetor[i] = new Livro();
            
            vetor[i].cod = Integer.parseInt(linha);
            vetor[i].editora = br.readLine();
            vetor[i].nome = br.readLine();
            vetor[i].autor = br.readLine();
            vetor[i].ano = Integer.parseInt(br.readLine());
            
            i++;
        }
        
        br.close();
        System.out.println("Leitura realizada com sucesso.");
        
        return i;
    }
    
    public void gravar(Livro[] vetor, int qtd)throws IOException
    {
       BufferedWriter bw = new BufferedWriter(new FileWriter("ResumoDosLivros.txt"));
       
       for(int i = 0; i < qtd; i++)
       {
           if(vetor[i] != null)
           {
                bw.write(Integer.toString(vetor[i].cod));
                bw.newLine();
           
                bw.write(vetor[i].editora);
                bw.newLine();
           
                bw.write(vetor[i].nome);
                bw.newLine();
           
                bw.write(vetor[i].autor);
                bw.newLine();
           
                bw.write(Integer.toString(vetor[i].ano));
                bw.newLine();
           }
       }
       bw.close();
       System.out.println("Arquivo gravado com sucesso.");
       
       String[] livrosIguais = new String[qtd];
       int qtdIguais = 0;
       
       for(int i = 0; i < qtd; i++)
       {
           if(vetor[i] != null)
           {
               boolean jaExiste = false;
               
               for(int k = 0; k < qtdIguais; k++)
               {
                   if(livrosIguais[k].equals(vetor[i].nome))
                   {
                       jaExiste = true;
                       break;
                   }
               }
               
               if(jaExiste == false)
               {
                   int totalExemplar = 0;
           
                for(int j = 0; j < qtd; j++)
                {
                    if(vetor[j] != null)
                    {
                        if(vetor[i].nome.equals(vetor[j].nome))
                        {
                            totalExemplar++;
               
                        }    
                    }
                }
                System.out.println("Livro: " + vetor[i].nome + " - Total de exemplares: " + totalExemplar);
                
                livrosIguais[qtdIguais] = vetor[i].nome;
                qtdIguais++;
               }
            }
        }
           
    }
    
    public int busca(Livro[] vetor, int alvo, int indiceAtual, int qtd)
    {
        if(indiceAtual >= qtd)
        {
            return -1;
        }
        
        if(vetor[indiceAtual] != null)
        {
            if(vetor[indiceAtual].cod == alvo)
            {
                return indiceAtual;
            }
        }
        
        return busca(vetor, alvo, indiceAtual +1, qtd);
    }
}