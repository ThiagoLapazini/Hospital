package ExHerança;

public class CarroConcreto extends Carro implements Veiculo{

    @Override
    public int getMarcha() {
        return 1;
    }
}
