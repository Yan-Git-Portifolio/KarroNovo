import java.util.Scanner;

public class Caminhao extends AutoMotor{

    private Integer cargaMaxima;
    private Integer numeroEixos;

    public Caminhao(String codigo, String cor, String marca, String modelo, String valor, String combustivel, Integer cargaMaxima, Integer numeroEixos) {
        super(codigo, cor, marca, modelo, valor, combustivel);
        this.cargaMaxima = cargaMaxima;
        this.numeroEixos = numeroEixos;
    }

    public Integer getCargaMaxima(){
        return this.cargaMaxima;
    }

    public void setCargaMaxima(Integer cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Integer getNumeroEixos(){
        return  this.numeroEixos;
    }

    public void setNumeroEixos(Integer numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public void consultar() {
        System.out.println("------------------------------------");
        System.out.println("O código é: "+getCodigo() +
                "\nA cor é: "+getCor()+
                "\nO combustível é: "+getCombustivel()+
                "\nA marca é: "+getMarca()+
                "\nO modelo é: "+getModelo()+
                "\nO valor é: R$"+getValor()+
                "\nA carga máxima é: "+getCargaMaxima().toString()+
                "\nO número de eixos é: "+getNumeroEixos().toString());
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
                "6 - carga máxima\n" +
                "7 - número de eixos");
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
            System.out.println("Qual a nova carga máxima? ");
            Integer novaCargaMaxima = scanner.nextInt();
            setCargaMaxima(novaCargaMaxima);
            scanner.nextLine();
        } else if (escolha == 7) {
            scanner.nextLine();
            System.out.println("Qual o novo número de eixos? ");
            Integer novoNumeroDeEixos = scanner.nextInt();
            setNumeroEixos(novoNumeroDeEixos);
            scanner.nextLine();
        }
    }
}
