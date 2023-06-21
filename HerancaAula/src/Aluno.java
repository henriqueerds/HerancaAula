//Importações
import java.util.Calendar;
import java.util.UUID;

//Clase
public class Aluno extends Pessoa{
    //Atributos
    private String matricula;

    //Métodos
    public Aluno (String nome, Calendar data_incio_existencia, String identificador, String nacionalidade, String naturalidade) {
        super(nome, null, null, nacionalidade, naturalidade);
        matricula = UUID.randomUUID().toString();
    }
}
