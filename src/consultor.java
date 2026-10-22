import java.time.LocalDateTime;

public class consultor extends funcionario{
    private double valorHora;
    private int horasTrabalhadas;

    public consultor(String nome, String cpf, LocalDateTime horarioEntrada, LocalDateTime horarioSaida, double valorHora, int horasTrabalhadas) {
        super(nome, cpf, horarioEntrada, horarioSaida);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override 
    public double calcularSalario() {
        double salario = (getHorasTrabalhadas() * getValorHora());

        return salario;
    }
}
