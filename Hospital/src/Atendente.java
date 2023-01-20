public final class Atendente extends Funcionario {

    public Atendente(String nome, int idade, int idFuncionario) {
        super(nome, idade, idFuncionario);
    }

    @Override
    public void baterPonto(int dia, int hora, int minuto) {
        System.out.printf("Ponto do" + getNome() + "efetuado com sucesso!");
    }

    public final String encaminhamento(Paciente paciente) {
        if (paciente.listadeSintomas().contains("Confusão mental"))
            return "Neuro";
        else {
            return "Clinico Geral";
        }
    }
}

