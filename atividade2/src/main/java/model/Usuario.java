import src.main.java.EmailInvalidoException;
import src.main.java.NomeInvalidoException;

package src.main.java.model;
public class Usuario extends Pessoa {

    private Integer matricula;
    
    public Usuario(String nome, String email, Integer matricula) throws Exception{
       
        super(nome, email);
        this.matricula = matricula; 
        if (nome== null || nome.length() < 1) {
            throw new NomeInvalidoException();
            
        }
        if (email== null || email.length() < 3) {
            throw new EmailInvalidoException();
            
        }
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    @Override
    public void exibirInfo(){
        System.out.println("Nome: " +this.getNome());
        System.out.println("Email: " +this.getEmail());
        System.out.println("Matrícula: " +this.matricula);
    }
}
