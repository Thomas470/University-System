public class Professor extends Pessoa{
    Double salario;

    public Professor(String cpf, String nome, int idade, Double salario) {
		super(cpf, nome, idade);
		this.salario = salario;
	}

	public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
