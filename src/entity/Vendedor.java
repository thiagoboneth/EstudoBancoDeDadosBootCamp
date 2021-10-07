package entity;

public class Vendedor {

    private String codigo;
    private String cpf;
    private String nome;
    private String endereco;
    private String uf;
    private String cidade;

    public Vendedor(String codigo, String cpf, String nome, String endereco, String uf, String cidade) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.uf = uf;
        this.cidade = cidade;
    }

    public Vendedor(String cpf, String nome, String endereco, String uf, String cidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.uf = uf;
        this.cidade = cidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "codigo='" + codigo + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
