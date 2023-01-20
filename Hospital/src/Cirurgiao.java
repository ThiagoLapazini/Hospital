import java.util.List;

public class Cirurgiao extends Medico{

    public Cirurgiao(int idFuncionario) {
        super(idFuncionario);
    }

    public Cirurgiao(String nome, int idade, int idFuncionario) {
        super(nome, idade, idFuncionario);
    }

    @Override
    public String fazerDiagnostico() {
        return null;
    }

    public void reservarSala(int dia, int hora){
        System.out.println("Reservando sala cirurgia");
    }
}
