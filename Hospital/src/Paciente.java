import java.util.ArrayList;
import java.util.Arrays;

public class Paciente extends Pessoa{
    private String [] listaSintomas;

    public Paciente() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente paciente)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(listaSintomas);
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
        this.listaSintomas = new String[]{listaSintomas};
    }

}
