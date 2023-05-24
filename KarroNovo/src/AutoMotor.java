import java.util.Scanner;

public class AutoMotor extends Veiculo{

    protected String combustivel;

    public AutoMotor(String codigo, String cor, String marca, String modelo, String valor, String combustivel){
        super(codigo, cor, marca, modelo, valor);
        this.combustivel = combustivel;
    }

    public String getCombustivel(){
        return this.combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public void consultar(){}

    @Override
    public void editar(){}

    public String alterarCombustivel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o combustível do veículo? \n" +
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
}
