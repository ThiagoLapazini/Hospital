public class Main {
    public static void main(String[] args) {

        Programador programador = new Programador("Thiago", "035453232", 5000);

        Atendente atendente = new Atendente("Joao", "384673248", 2500);

        atendente.bonus();
        programador.bonus();
        programador.bonus(5000,true);
        atendente.bonus(true);
    }
}
