   
    import java.util.ArrayList;
    import java.util.List;
    
    public class GestaoFrota {
        private List<Veiculo> frota;
    
        public GestaoFrota() {
            this.frota = new ArrayList<>();
        }
    
        public void adicionarVeiculo(Veiculo veiculo) {
            frota.add(veiculo);
            System.out.println("Veículo adicionado: " + veiculo.getMarca() + " " + veiculo.getModelo());
        }
    
        public void removerVeiculo(Veiculo veiculo) {
            if (frota.remove(veiculo)) {
                System.out.println("Veículo removido: " + veiculo.getMarca() + " " + veiculo.getModelo());
            } else {
                System.out.println("Veículo não encontrado: " + veiculo.getMarca() + " " + veiculo.getModelo());
            }
        }
    
        public void listarVeiculos() {
            if (frota.isEmpty()) {
                System.out.println("A frota está vazia.");
            } else {
                System.out.println("Lista de veículos na frota:");
                for (Veiculo veiculo : frota) {
                    System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getAno() + ")");
                }
            }
        }
    }
    
