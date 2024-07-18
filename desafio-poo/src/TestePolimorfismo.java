public class TestePolimorfismo {

        public static void main(String[] args) {
            Veiculo carro = new Carro("Toyota", "Corolla", 2020, 4);
            Veiculo moto = new Moto("Honda", "CB500", 2019, false);
    
            carro.acelerar();
            moto.acelerar();
    
            System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
            System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo());
        }
    }
    