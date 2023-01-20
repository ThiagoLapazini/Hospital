import java.util.List;

public class Neurocirurgiao extends Medico {
    public Neurocirurgiao(int idFuncionario) {
        super(idFuncionario);
    }

    public Neurocirurgiao(String nome, int idade, int idFuncionario) {
        super(nome, idade, idFuncionario);
    }

    @Override
    public String fazerDiagnostico() {
        return null;
    }

    @Override
    public String fazerDiagnostico(List<String> sintomas) {
        if (sintomas.size() > 3) {
            System.out.println("Necessita cirurgia");
        } else {
            System.out.println("Receitando medicamento");
        }
        return null;
    }

}

