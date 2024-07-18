public class TesteGestaoFrota {

        public static void main(String[] args) {
            GestaoFrota gestaoFrota = new GestaoFrota();
    
            Veiculo carro1 = new Carro("Toyota", "Corolla", 2020, 4);
            Veiculo carro2 = new Carro("Honda", "Civic", 2018, 4);
            Veiculo moto1 = new Moto("Yamaha", "MT-07", 2021, false);
            Veiculo moto2 = new Moto("Suzuki", "GSX-R750", 2019, false);
    
            gestaoFrota.adicionarVeiculo(carro1);
            gestaoFrota.adicionarVeiculo(carro2);
            gestaoFrota.adicionarVeiculo(moto1);
            gestaoFrota.adicionarVeiculo(moto2);
    
            gestaoFrota.listarVeiculos();
    
            gestaoFrota.removerVeiculo(carro1);
            gestaoFrota.removerVeiculo(moto1);
    
            gestaoFrota.listarVeiculos();
        }
    }
    
