import java.util.Calendar;

public class Main {
    private static Pessoa grupo[];
    public static void main(String[] args) {
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980,10,23);
        grupo = new Pessoa[2];
        grupo [0] = new Fisica ("Marcos Antonio", data_nasc, "365.586.236-35", "Brasil", "Rio de Janeiro");
        grupo [1] = new Pessoa("Escola Novo Mundo Ltda", null, "43.186.666/0026-32", "Brasil", "Rio de Janeiro");
        for (int i = 0; i <= 1; i++)
            System.out.println("grupo[" + i + "]: " + grupo[i].ToString());
    }
}