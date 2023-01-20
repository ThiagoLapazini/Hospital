public class Programador extends Funcionario{
    private Boolean isHoraExtra = true;
    private double salario = 5000.00;
    public Programador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void  bonus() {
        System.out.println(this.salario + this.salario * 0.35);
    }

    public void bonus(double salario, boolean isHoraExtra){
        if(isHoraExtra ==true){
            System.out.println(this.salario + this.salario * 0.50);
        }else{
            System.out.println(this.salario + this.salario * 0.35);
        }
    }
}
