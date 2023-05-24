import java.util.Scanner;

public class Moto extends AutoMotor{

    private Boolean partidaEletrica;
    private Integer cilindradas;

    public Moto(String codigo, String cor, String marca, String modelo, String valor, String combustivel, Boolean partidaEletrica, Integer cilindradas) {
        super(codigo, cor, marca, modelo, valor, combustivel);
        this.partidaEletrica = partidaEletrica;
        this.cilindradas = cilindradas;
    }

    public Boolean getPartidaEletrica() {
        return this.partidaEletrica;
    }

    public void setPartidaEletrica(Boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public Integer getCilindradas(){
        return this.cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void consultar() {
        System.out.println("------------------------------------");
        System.out.println("O código é: "+getCodigo() +
                "\nA cor é: "+getCor()+
                "\nO combustível é: "+getCombustivel()+
                "\nA marca é: "+getMarca()+
                "\nO modelo é: "+getModelo()+
                "\nO valor é: R$"+getValor()+
                "\nPartida elétrica: "+getPartidaEletrica().toString()+
                "\nO número de cilindradas é: "+getCilindradas().toString());
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
                "6 - partida eletrica\n" +
                "7 - cilindradas\n");
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
            System.out.println("Partida elétrica? sim[1] não[2]");
            Integer temPartidaEletrica = scanner.nextInt();
            scanner.nextLine();
            Boolean partidaEletrica = false;
            switch (temPartidaEletrica){
                case (1):
                    partidaEletrica = true;
                    break;
                case (2):
                    partidaEletrica = false;
                    break;
            }
            setPartidaEletrica(partidaEletrica);
        } else if (escolha == 7) {
            scanner.nextLine();
            System.out.println("Quantas cilindradas? ");
            Integer novaCilindradas = scanner.nextInt();
            setCilindradas(novaCilindradas);
            scanner.nextLine();
        }
    }
}
