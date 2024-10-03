public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mingau");

        cachorro.caminha();
        cachorro.late();

        gato.caminha();
        gato.mia();
    }
}