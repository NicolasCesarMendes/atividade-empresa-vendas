import java.time.LocalDateTime;

public class vendedor extends funcionario {
    private double comissao;
    private int numeroVendas;

    public vendedor(String nome, String cpf, LocalDateTime horarioEntrada, LocalDateTime horarioSaida, double comissao, int numeroVendas) {
        super(nome, cpf, horarioEntrada, horarioSaida);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    @Override 
    public double calcularSalario() {
        double salario = getSalarioMinimo() + (getComissao() * getNumeroVendas());

        return salario;
    }
}
