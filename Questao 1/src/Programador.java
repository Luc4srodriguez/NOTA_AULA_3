public class Programador extends Funcionario {
    String linguagem;

    public Programador(String nome, String nasc, double salario, String linguagem){
        super(nome, nasc, salario);
        this.linguagem=linguagem;
    }
    public String informarLinguagem(){
        return linguagem;
    }
}
