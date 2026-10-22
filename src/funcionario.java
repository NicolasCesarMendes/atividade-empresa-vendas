import java.time.LocalDateTime;

public abstract class funcionario {
    private String nome;
    private String cpf;
    private double salarioMinimo;
    private LocalDateTime horarioEntrada;
    private LocalDateTime horarioSaida;

    public funcionario(String nome, String cpf, LocalDateTime horarioEntrada, LocalDateTime horarioSaida) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioMinimo = 1621.00;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public LocalDateTime getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(LocalDateTime horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public LocalDateTime getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(LocalDateTime horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public abstract double calcularSalario();
}
