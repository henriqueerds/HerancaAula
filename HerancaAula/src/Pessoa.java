import java.util.Calendar;

//Classe
public class Pessoa {
    //Atributos
    protected String nome, nacionalidade, naturalidade, identificador;
    private Calendar data_incio_existencia;
    private int idade;

    //Métodos
    public Pessoa (String nome, Calendar data_incio_existencia, String identificador, String nacionalidade, String naturalidade) {
        this.nome = nome;
        this.data_incio_existencia = data_incio_existencia;
        this.identificador = identificador;
        this. nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
    protected void atualizarNome (String nome) {
        this.nome = nome;
    }
    protected String recuperarNome () {
        return this.nome;
    }
    protected  String recuperarNacionalidade () {
        return this.nacionalidade;
    }
    protected  String recuperarNaturalidade () {
        return this.naturalidade;
    }
    public String ToString() {
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
    }
}
