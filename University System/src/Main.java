import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        Universidade universidade = new Universidade();
        universidade.listaCursos();
    
        Menu menu = new Menu(); 
        
    	Curso curso = new Curso(null);
        Disciplina disciplina = new Disciplina(null);        
        do {
        	
            System.out.println("*************Menu*************");
            System.out.println("1 - Cadastrar Universidade");
            System.out.println("2 - Cadastrar Estudante");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Cadastrar Curso");
            System.out.println("5 - Cadastrar Disciplina");
            System.out.println("6 - Mostrar dados da universidade");
            System.out.println("7 - Sair");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    universidade.cadastrarUniversidade();
                    break;
                case 2: if(disciplina.getNome() == null) {
                System.out.println("E necessario cadastrar uma disciplina para inserir um estudante");
                	}
                	else {disciplina.addEstudante(menu.cadastrarEstudante());	
                	}
                    break;
                case 3:
                	if(disciplina.getNome() == null) {System.out.println("Sera necessario cadastrar uma disciplina para inserir um professor");
                	}
                	else {disciplina.setProfessor(menu.cadastrarProfessor());	
                	}
                    break;
                case 4:
                	if(universidade.getNome() == null) {System.out.println("E necessario cadastrar uma universidade para inserir um curso");
                	}
                	else {
                    	curso = menu.cadastrarCurso();
                    	universidade.addCurso(curso);	
                	}
                    break;
                case 5:
                	if(curso.getNome() == null) {System.out.println("Sera necessario cadastrar um curso para inserir uma disciplina");
                	}
                	else {
                    	disciplina = menu.cadastrarDisciplina();curso.addDisciplina(disciplina);	
                	}
                    break;
                case 6:universidade.mostrarDados();
                    break;
                case 7:
                    break;
                default:System.out.println("Digite um valor que seja valido!");
                    break;
            }
        } while (opcao != 7);
        scanner.close();
    }
}	