public class Gerente extends Funcionario {
    String projeto;

    public Gerente(String nome, String nasc, double salario, String projeto){
        super(nome, nasc, salario);
        this.projeto=projeto;
    }
    public String informarProjeto(){
        return projeto;
    }

}
