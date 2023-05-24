
public abstract class Veiculo {

    protected String codigo;
    protected String cor;
    protected String marca;
    protected String modelo;
    protected String valor;

    public Veiculo(String codigo, String cor, String marca, String modelo, String valor){
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void consultar(){}

    public void editar(){}

}
