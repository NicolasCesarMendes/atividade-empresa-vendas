import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        vendedor vendedorJoao = new vendedor("João", "463-267-322-76", LocalDateTime.of(2026, 10, 14, 12, 30), LocalDateTime.of(2024, 3, 15, 18, 30), 300.00, 13);

        consultor consultorLucas = new consultor("Lucas", "471-072-109-47", LocalDateTime.of(2026, 10, 14, 8, 30), LocalDateTime.of(2024, 3, 15, 12, 30), 22.00, 38);

        gerente gerenteEnzo = new gerente("Enzo", "453-219-794-81", LocalDateTime.of(2026, 10, 14, 8, 30), LocalDateTime.of(2024, 3, 15, 18, 30), 6700);

        ArrayList<funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(vendedorJoao);
        funcionarios.add(consultorLucas);
        funcionarios.add(gerenteEnzo);

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("\n" + (i + 1) + "º Funcionário: ");
            System.out.println("Nome: " + funcionarios.get(i).getNome());
            System.out.println("Cargo: " + funcionarios.get(i).getClass().getName());
            System.out.println("Salário: " + funcionarios.get(i).calcularSalario());
        }
    }
}
