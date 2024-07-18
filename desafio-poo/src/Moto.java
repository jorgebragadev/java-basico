
public class Moto extends Veiculo {
    private boolean temCarroLateral;

    public Moto(String marca, String modelo, int ano, boolean temCarroLateral) {
        super(marca, modelo, ano);
        this.temCarroLateral = temCarroLateral;
    }

    public boolean isTemCarroLateral() {
        return temCarroLateral;
    }

    public void setTemCarroLateral(boolean temCarroLateral) {
        this.temCarroLateral = temCarroLateral;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
}

