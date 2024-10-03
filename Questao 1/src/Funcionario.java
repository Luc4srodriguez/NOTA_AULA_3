public class Funcionario {
    String nome;
    String nasc;
    double salario;

    public Funcionario(String nome, String nasc, double salario){
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public double informarSalario(){
        return salario;
    }

    public int calcularIdade(){
        return 2024 - Integer.parseInt(nasc);
    }
}
