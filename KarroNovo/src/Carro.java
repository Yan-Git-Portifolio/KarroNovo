import java.util.Scanner;

public class Carro extends AutoMotor{

    private Integer qtdePortas;

    public Carro(String codigo, String cor, String marca, String modelo, String valor, String combustivel, Integer qtdePortas){
        super(codigo, cor, marca, modelo, valor, combustivel);
        this.qtdePortas = qtdePortas;
    }

    public Integer getQtdePortas() {
        return this.qtdePortas;
    }


    public void setQtdePortas(Integer qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public void consultar() {
        System.out.println("------------------------------------");
        System.out.println("O código é: "+getCodigo() +
                "\nA cor é: "+getCor()+
                "\nO combustível é: "+getCombustivel()+
                "\nA marca é: "+getMarca()+
                "\nO modelo é: "+getModelo()+
                "\nO valor é: R$"+getValor()+
                "\nA quantidade de portas é: "+getQtdePortas().toString());
        System.out.println("------------------------------------");
    }

    public void editar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que quer editar?\n" +
                "1 - cor\n" +
                "2 - combustível\n" +
                "3 - marca\n" +
                "4 - modelo\n" +
                "5 - valor\n" +
                "6 - quantidade de portas\n");
        Integer escolha = scanner.nextInt();
        if (escolha == 1){
            scanner.nextLine();
            System.out.println("Qual a nova cor? ");
            String novaCor = scanner.nextLine();
            setCor(novaCor);
        } else if (escolha == 2) {
            setCombustivel(alterarCombustivel());
        } else if(escolha == 3) {
            scanner.nextLine();
            System.out.println("Qual a nova marca? ");
            String novaMarca = scanner.nextLine();
            setMarca(novaMarca);
        } else if (escolha == 4) {
            scanner.nextLine();
            System.out.println("Qual o novo modelo? ");
            String novoModelo = scanner.nextLine();
            setModelo(novoModelo);
        } else if (escolha == 5) {
            scanner.nextLine();
            System.out.println("Qual o novo valor? ");
            String novoValor = scanner.nextLine();
            setValor(novoValor);
        } else if (escolha == 6) {
            scanner.nextLine();
            System.out.println("Qual a nova quantidade de portas? ");
            Integer novaQtdePortas = scanner.nextInt();
            setQtdePortas(novaQtdePortas);
            scanner.nextLine();
        }
    }
}
