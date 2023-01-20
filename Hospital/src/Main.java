import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Paciente paciente = new Paciente();
        paciente.setNome(sc.nextLine());
        paciente.setIdade(sc.nextInt());
        paciente.setListaSintomas(sc.nextLine());

        Sala sala = new Sala();

        Atendente atendente = new Atendente("Thiago", 18, 4576372);
        atendente.baterPonto(12,21,49);
        atendente.fazerAtendimento(paciente);
        atendente.encaminhamento(paciente);

        Neurocirurgiao neuro = new Neurocirurgiao("Doutor",29,484555) ;
        neuro.baterPonto(13,13,29);
        neuro.fazerDiagnostico();
        sala.reservarSala(14,23,59);
        neuro.fazerDiagnostico(Collections.singletonList("Depressão"));

        ClinicoGeral clinico = new ClinicoGeral("Doutor2", 36,7643743);

    }
}
