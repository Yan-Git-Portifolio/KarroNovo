import java.util.Scanner;

public class Main {
    static Boolean running = true;
    public static void main(String[] args) {

        Concessionaria concessionaria = new Concessionaria();
        while (running){
            menu(concessionaria);
        }

    }

    public static void menu(Concessionaria concessionaria) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que você deseja fazer?\n" +
                "1 - Cadastrar novo veículo\n" +
                "2 - Editar veículo\n" +
                "3 - Ver informações de um veículo específico\n" +
                "4 - Excluir um veículo\n" +
                "5 - Ver todos os veículos\n" +
                "6 - Sair");
        Integer escolha = scanner.nextInt();
        scanner.nextLine();
        if (escolha == 1) {
            concessionaria.cadastrarVeiculo();
        } else if (escolha == 2) {
            concessionaria.editarVeiculo();
        } else if (escolha == 3) {
            concessionaria.getVeiculo();
        } else if (escolha == 4) {
            concessionaria.excluirVeiculo();
        } else if (escolha == 5) {
            concessionaria.getVeiculos();
        } else {
            running = false;
        }
    }
}