import java.util.Scanner;

public class Bicicleta extends Veiculo{

    private String freio;

    public Bicicleta(String codigo, String cor, String marca, String modelo, String valor, String freio) {
        super(codigo, cor, marca, modelo, valor);
        this.freio = freio;
    }

    public String getFreio(){
        return this.freio;
    }

    public void setFreio(String freio){
        this.freio = freio;
    }

    public void consultar() {
        System.out.println("------------------------------------");
        System.out.println("O código é: "+getCodigo() +
                "\nA cor é: "+getCor()+
                "\nA marca é: "+getMarca()+
                "\nO modelo é: "+getModelo()+
                "\nO valor é: R$"+getValor()+
                "\nO freio é: "+getFreio());
        System.out.println("------------------------------------");
    }

    public void editar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que quer editar?\n" +
                "1 - cor\n" +
                "2 - freio\n" +
                "3 - marca\n" +
                "4 - modelo\n" +
                "5 - valor\n");
        Integer escolha = scanner.nextInt();
        if (escolha == 1){
            scanner.nextLine();
            System.out.println("Qual a nova cor? ");
            String novaCor = scanner.nextLine();
            setCor(novaCor);
        } else if (escolha == 2) {
            scanner.nextLine();
            System.out.println("Qual o novo freio? ");
            String novoFreio = scanner.nextLine();
            setFreio(novoFreio);
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
        }
    }

}
