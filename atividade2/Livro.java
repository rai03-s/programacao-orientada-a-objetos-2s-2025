public class Livro extends Material 
{
    private String autor;
    public Livro(String titulo, Integer anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void descricao(){
        System.out.println("Título: " +getTitulo());
        System.out.println("Ano: "+getAnoPublicacao());
        System.out.println("Autor: " +getAutor());
    }
}

