import java.util.List;

public abstract class Medico extends Funcionario {
    public Medico(int idFuncionario) {
        super(idFuncionario);
    }

    public Medico(String nome, int idade, int idFuncionario) {
        super(nome, idade, idFuncionario);
    }

    public void fazerAtendimento(Paciente paciente) {
        System.out.println("Efetuando atendimento do paciente: " + paciente.getNome());
    }

    public final void baterPonto(int dia, int hora, int minuto) {
        System.out.println("Ponto efetuado");
    }

    public abstract String fazerDiagnostico();


    public abstract String fazerDiagnostico(List<String> sintomas);
}
