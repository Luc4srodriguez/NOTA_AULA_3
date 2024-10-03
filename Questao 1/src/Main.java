public class Main {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Carlos","1980",5000.0,"Projeto x");
        Programador programador = new Programador("Ana","1995",4000.0,"java");

        System.out.println(gerente.nome + " Está gerenciando " + gerente.informarProjeto());
        System.out.println(programador.nome + " programa em " + programador.informarLinguagem());
    }
}