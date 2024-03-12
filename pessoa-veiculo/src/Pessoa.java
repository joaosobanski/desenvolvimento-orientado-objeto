import java.util.ArrayList;

public class Pessoa {
    String nome;
    String fone;
    String cidadeNascimento;
    ArrayList<Pessoa> amigos;
    ArrayList<Veiculo> veiculos;

    public Pessoa(
            String nome,
            String fone,
            String cidadeNascimento) {
        this.nome = nome;
        this.fone = fone;
        this.cidadeNascimento = cidadeNascimento;
        this.amigos = new ArrayList<>();
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo.getDono() == null) {
            veiculos.add(veiculo);
            veiculo.setDono(this);
            return;
        }

        System.out.println("Veiculos ja possui um dono!");
    }

    public void adicionarAmigo(Pessoa p) {
        p.amigos.add(this);
        this.amigos.add(p);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public ArrayList<Pessoa> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Pessoa> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome +
                ", fone=" + fone +
                ", cidadeNascimento=" + cidadeNascimento +
                ", veiculos=" + veiculos.size() +
                ", amigos=" + amigos.size() + "]";
    }

}
