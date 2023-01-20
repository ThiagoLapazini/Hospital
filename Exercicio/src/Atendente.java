public class Atendente extends Funcionario{

    private boolean isMetaCumprida = true;

    private double salario = 2001.00;

    public Atendente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void bonus() {
        System.out.println(this.salario + this.salario * 0.15);
    }

    public void bonus(boolean isMetaCumprida) {
        if(isMetaCumprida == true){
            System.out.println(this.salario + this.salario * 0.20);
        }else {
            System.out.println(this.salario + this.salario * 0.15);
        }    }
}

