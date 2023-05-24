import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Concessionaria {

    private List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public void cadastrarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tipo de veículo será cadastrado? \n" +
                "1 - Carro\n" +
                "2 - Moto\n" +
                "3 - Caminhão\n" +
                "4 - Bicicleta\n" +
                "5 - Voltar ao menu inicial\n");
        Integer escolha = scanner.nextInt();
        scanner.nextLine();
        if (escolha == 1) {
            System.out.println("Qual o código do carro? ");
            String codigo = scanner.nextLine();

            System.out.println("Qual a cor do carro? ");
            String cor = scanner.nextLine();

            System.out.println("Qual o marca do carro? ");
            String marca = scanner.nextLine();

            System.out.println("Qual o modelo do carro? ");
            String modelo = scanner.nextLine();

            System.out.println("Qual o valor do carro? ");
            String valor = scanner.nextLine();

            String combustivel = pegaCombustivel();

            System.out.println("Qual quantidade de portas do carro? ");
            Integer qtdePortas = scanner.nextInt();
            this.veiculos.add(new Carro(codigo, cor, marca, modelo, valor, combustivel, qtdePortas));
            System.out.println("Veículo cadastrado com sucesso!");

        } else if (escolha == 2) {
            System.out.println("Qual o código da moto? ");
            String codigo = scanner.nextLine();

            System.out.println("Qual a cor da moto? ");
            String cor = scanner.nextLine();

            System.out.println("Qual o marca da moto? ");
            String marca = scanner.nextLine();

            System.out.println("Qual o modelo da moto? ");
            String modelo = scanner.nextLine();

            System.out.println("Qual o valor da moto? ");
            String valor = scanner.nextLine();

            String combustivel = pegaCombustivel();

            System.out.println("Partida elétrica? sim[1] não[2]");
            Integer temPartidaEletrica = scanner.nextInt();
            Boolean partidaEletrica = false;
            scanner.nextLine();
            switch (temPartidaEletrica){
                case (1):
                    partidaEletrica = true;
                    break;
                case (2):
                    partidaEletrica = false;
                    break;
            }
            System.out.println("Quantas cilindradas? ");
            Integer cilindradas = scanner.nextInt();
            scanner.nextLine();
            this.veiculos.add(new Moto(codigo, cor, marca, modelo, valor, combustivel, partidaEletrica, cilindradas));
            System.out.println("Veículo cadastrado com sucesso!");

        } else if (escolha == 3) {
            System.out.println("Qual o código do caminhão? ");
            String codigo = scanner.nextLine();

            System.out.println("Qual a cor do caminhão? ");
            String cor = scanner.nextLine();

            System.out.println("Qual o marca do caminhão? ");
            String marca = scanner.nextLine();

            System.out.println("Qual o modelo do caminhão? ");
            String modelo = scanner.nextLine();

            System.out.println("Qual o valor do caminhão? ");
            String valor = scanner.nextLine();

            String combustivel = pegaCombustivel();

            System.out.println("Qual a carga máxima? ");
            Integer cargaMaxima = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Número de eixos? ");
            Integer numeroDeEixos = scanner.nextInt();
            scanner.nextLine();

            this.veiculos.add(new Caminhao(codigo, cor, marca, modelo, valor, combustivel, cargaMaxima, numeroDeEixos));
            System.out.println("Veículo cadastrado com sucesso!");

        } else if (escolha == 4){
            System.out.println("Qual o código da bicicleta? ");
            String codigo = scanner.nextLine();

            System.out.println("Qual a cor da bicicleta? ");
            String cor = scanner.nextLine();

            System.out.println("Qual o marca da bicicleta? ");
            String marca = scanner.nextLine();

            System.out.println("Qual o modelo do bicicleta? ");
            String modelo = scanner.nextLine();

            System.out.println("Qual o valor do caminhão? ");
            String valor = scanner.nextLine();

            System.out.println("Qual o freio? \n" +
                    "c - Cantiléver\n" +
                    "v - V-Brake\n" +
                    "f - Ferradura\n" +
                    "m - Disco Mecânico\n" +
                    "h - Disco Hidráulico\n");
            String escolhaFreio = scanner.nextLine();
            String tipoFreio = null;
            if (escolhaFreio.equals("c")){
                tipoFreio = "Gasolina";
            } else if (escolhaFreio.equals("v")) {
                tipoFreio = "Alcoól";
            } else if (escolhaFreio.equals("f")) {
                tipoFreio = "Flex";
            } else if (escolhaFreio.equals("m")) {
                tipoFreio = "Elétricos";
            } else if (escolhaFreio.equals("h")) {
                tipoFreio = "Diesel";
            }

            this.veiculos.add(new Bicicleta(codigo, cor, marca, modelo, valor, tipoFreio));
            System.out.println("Veículo cadastrado com sucesso!");
        }
    }

    public String pegaCombustivel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o combustível do carro? \n" +
                "g - Gasolina\n" +
                "a - Alcoól\n" +
                "f - Flex\n" +
                "e - Elétricos\n" +
                "d - Diesel");
        String combustivel = scanner.nextLine();
        if (combustivel.equals("g")){
            return "Gasolina";
        } else if (combustivel.equals("a")) {
            return "Alcoól";
        } else if (combustivel.equals("a")) {
            return "Flex";
        } else if (combustivel.equals("a")) {
            return "Elétricos";
        } else if (combustivel.equals("a")) {
            return "Diesel";
        }
        return "Erro";
    }

    public void editarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o código do veículo? ");
        String codigo = scanner.nextLine();
        for (Veiculo veiculo: this.veiculos) {
            if (veiculo.getCodigo().equals(codigo)){
                veiculo.consultar();
                veiculo.editar();
            } else {
                System.out.println("Veículo não encontrado.");
            }
        }
    }

    public void getVeiculo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o código do veículo? ");
        String codigo = scanner.nextLine();
        for (Veiculo veiculo: this.veiculos) {
            if (veiculo.getCodigo().equals(codigo)){
                veiculo.consultar();
            } else {
                System.out.println("Veículo não encontrado.");
            }
        }
    }
    public void getVeiculos() {
        for (Veiculo veiculo: this.veiculos) {
            veiculo.consultar();
        }
    }

    public void excluirVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o código do veículo? ");
        String codigo = scanner.nextLine();

        Iterator<Veiculo> iterator = this.veiculos.iterator();
        boolean veiculoEncontrado = false;
        while (iterator.hasNext()) {
            Veiculo veiculo = iterator.next();
            if (veiculo.getCodigo().equals(codigo)) {
                veiculo.consultar();
                iterator.remove();
                veiculoEncontrado = true;
                break;
            }
        }
        if (!veiculoEncontrado) {
            System.out.println("Veículo não encontrado.");
        }
    }


}
