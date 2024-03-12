public class Veiculo {
    String placa;
    String marca;
    String cor;
    String modelo;
    Integer ano;
    Pessoa dono;

    public Veiculo(
            String placa,
            String marca,
            String cor,
            String modelo,
            Integer ano) {
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa +
                ", marca=" + marca +
                ", cor=" + cor +
                ", modelo=" + modelo +
                ", ano=" + ano +
                ", dono=" + dono + "]";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

}
