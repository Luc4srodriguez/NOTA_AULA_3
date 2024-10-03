class Animal {
    String nome;
    String raça;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }
}
