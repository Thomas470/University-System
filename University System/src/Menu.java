import java.util.Scanner;

public class Menu {
	public Estudante cadastrarEstudante(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o cpf:");
        String cpf = scanner.nextLine();
        
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();
        
        System.out.println("Digite a matricula:");
        int matricula = scanner.nextInt();
        
        Estudante estudante = new Estudante(nome, cpf, idade, matricula);
        
        return estudante;
    }
    public Curso cadastrarCurso(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do curso:");
        String nome = scanner.nextLine();

        Curso curso = new Curso(nome);
        return curso;
    }
    
    public Professor cadastrarProfessor(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o cpf:");
        String cpf = scanner.nextLine();
        
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();
        
        System.out.println("Digite o salario:");
        Double salario = scanner.nextDouble();

        Professor professor = new Professor(nome, cpf, idade, salario);
        return professor;
    }
    public Disciplina cadastrarDisciplina(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome da disciplina:");
        String nome = scanner.nextLine();
        
        Disciplina disciplina = new Disciplina(nome);

        return disciplina;
    }
}
