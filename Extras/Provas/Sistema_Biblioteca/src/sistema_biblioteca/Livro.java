public class Livro
{
    int cod;
    String editora;
    String nome;
    String autor;
    int ano;
    
    public Livro()
    {
        this(0, "", "", "", 0);
    }
    
    public Livro(int cod, String editora, String nome, String autor, int ano)
    {
        this.cod = cod;
        this.editora = editora;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }
}