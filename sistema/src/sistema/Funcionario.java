package sistema;

public abstract class Funcionario extends Pessoa {
    private String matricula;
    private double salario;
    public Funcionario(String nome, String cpf, int idade, String matricula, double salario) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract double calcularSalario();
    @Override
    public abstract void exibirInformacoes();
}