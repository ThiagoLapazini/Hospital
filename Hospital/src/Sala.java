
public class Sala {
    private boolean isDisponivel = true;

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }

    public void reservarSala(int dia, int hora, int minuto) {
        if (this.isDisponivel == true) {
            System.out.println("Sala reservada com sucesso");
            this.isDisponivel = false;
        } else {
            System.out.println("Sala Indisponivel");
        }
    }
}
