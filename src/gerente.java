import java.time.LocalDateTime;

public class gerente extends funcionario{
    private double bonificacao;

    public gerente(String nome, String cpf, LocalDateTime horarioEntrada, LocalDateTime horarioSaida, double bonificacao) {
        super(nome, cpf, horarioEntrada, horarioSaida);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override 
    public double calcularSalario() {
        double salario = (6 * getSalarioMinimo()) + getBonificacao();

        return salario;
    }
}
