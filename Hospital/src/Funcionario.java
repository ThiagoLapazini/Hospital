public abstract class Funcionario extends Pessoa{
    private int idFuncionario;

    public Funcionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Funcionario(String nome, int idade, int idFuncionario) {
        super(nome, idade);
        this.idFuncionario = idFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void fazerAtendimento(Paciente paciente) {

    }

    public abstract void baterPonto(int dia, int hora, int minuto);
}
