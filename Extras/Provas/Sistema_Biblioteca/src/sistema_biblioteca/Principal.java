import java.io.IOException;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        ClasseMetodos cm = new ClasseMetodos();
        Livro[] vetor = new Livro[9359];
        
        int opc = 0;
        int leitura = 0;
        
        do
        {
            System.out.println("----Menu principal-----\n");
            System.out.println("1- Leitura do arquivo\n" +
                                "2- Gravar livros\n" +
                                "3- Buscar livro\n" +
                                "9- Fim");
            System.out.print("Digite uma opção:");
            opc = sc.nextInt();
            
            switch(opc)
            {
                case 1:
                    leitura = cm.ler(vetor, vetor.length);
                    System.out.println("Quantidade de livros lidos: " + leitura);
                    break;
                case 2:
                    if(leitura == 0)
                    {
                        System.out.println("Primeiro faça a leitura do arquivo.");
                        break;
                    }
                    cm.gravar(vetor, leitura);
                    break;
                case 3:
                    if(leitura == 0)
                    {
                        System.out.println("Primeiro faça a leitura do arquivo.");
                        break;
                    }
                    System.out.println("Digite o código do livro para pesquisar: ");
                    int numProcurado = sc.nextInt();
                    
                    int numRetornado = cm.busca(vetor, numProcurado, 0, leitura);
                    
                    if(numRetornado == -1)
                    {
                        System.out.println("Este livro não existe no acervo.");
                    }
                    else
                    {
                        System.out.println("O livro: " + vetor[numRetornado].nome + " existe no acervo na posição " + numRetornado);  
                    }
                    break;
                case 9:
                    System.out.println("Programa encerrado.");
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente: ");
            }
            
        }while(opc != 9);
    }
}