import java.util.ArrayList;
import java.util.Arrays;

public class Paciente extends Pessoa{
    private String [] listaSintomas;

    public Paciente() {

    }

    public ArrayList<String> listadeSintomas(){
        return new ArrayList<String>(Arrays.asList (listaSintomas));
    }
    public Paciente(String[] listaSintomas) {
        this.listaSintomas = listaSintomas;

    }

    public Paciente(String nome, int idade, String[] listaSintomas) {
        super(nome, idade);
        this.listaSintomas = listaSintomas;
    }

    public String[] getListaSintomas() {
        return listaSintomas;
    }

    public void setListaSintomas(String listaSintomas) {
        this.listaSintomas = listaSintomas;
    }

}
