public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa(
                "Pabro",
                "9999-9999",
                "Maringa");

        Pessoa pessoa2 = new Pessoa(
                "Marina",
                "9922-9999",
                "Campo mourão");

        Pessoa pessoa3 = new Pessoa(
                "Caio",
                "9922-22",
                "Curitiba");

        pessoa1.adicionarAmigo(pessoa2);
        pessoa3.adicionarAmigo(pessoa1);

        System.out.println();
        System.out.println(pessoa1);
        System.out.println();
        System.out.println(pessoa2);
        System.out.println();
    }
}
