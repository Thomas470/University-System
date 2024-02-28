public class Estudante extends Pessoa{
    int matricula;

	public Estudante(String cpf, String nome, int idade, int matricula) {
		super(cpf, nome, idade);
		this.matricula = matricula;
	}

	public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
