import java.util.List;

public class ClinicoGeral extends Medico{


    public ClinicoGeral(int idFuncionario) {
        super(idFuncionario);
    }

    public ClinicoGeral(String nome, int idade, int idFuncionario) {
        super(nome, idade, idFuncionario);
    }

    public final String encaminhamento(Paciente paciente) {
        if (paciente.listadeSintomas().contains("Confusão mental"))
            return "Neuro";
        else {
            return "Clinico Geral";
        }
    }
    @Override
    public String fazerDiagnostico() {
        return null;
    }

    @Override
    public String fazerDiagnostico(List<String> sintomas) {
        return null;
    }
}
