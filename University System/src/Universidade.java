import java.util.ArrayList;
import java.util.Scanner;

public class Universidade {
    String nome;
    String endereco;
    ArrayList <Curso> listaCursos;
    
    public void listaCursos(){
        this.listaCursos= new ArrayList<Curso>();
    }

    public void addCurso(Curso curso) {
    	this.listaCursos.add(curso);
    }
    public void cadastrarUniversidade(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        nome = scanner.nextLine();

        System.out.println("Digite o endere�o:");
        endereco = scanner.nextLine();

    }
    public void mostrarDados() {
    	System.out.println("*********Dados da Universidade*********");
    	System.out.println("Universidade: "+ nome);
    	System.out.println("Endereco: "+ endereco);
    	
    	System.out.println("*********Cursos*********");    	
    	for(int i = 0; i < listaCursos.size(); i++) {
    		System.out.println(listaCursos.get(i).getNome());  		
    	}
    	System.out.println("*********Disciplinas*********");  
    	for(int i = 0; i < listaCursos.size(); i++) {
    		for(int j = 0; j < listaCursos.get(i).getListaDisciplina().size(); j++) {	
    	    	System.out.println(listaCursos.get(i).getListaDisciplina().get(j).getNome());  		
    		}
    	}
    	System.out.println("*********Estudantes*********");  	
    	for(int i = 0; i < listaCursos.size(); i++) {
    		for(int j = 0; j < listaCursos.get(i).getListaDisciplina().size(); j++) {	
    			for(int w = 0; w < listaCursos.get(i).getListaDisciplina().get(j).getListaEstudantes().size(); w++) {
    	    		System.out.println(listaCursos.get(i).getListaDisciplina().get(j).getListaEstudantes().get(w).getNome());
    	    		System.out.println(listaCursos.get(i).getListaDisciplina().get(j).getListaEstudantes().get(w).getCpf());
    	    		System.out.println(listaCursos.get(i).getListaDisciplina().get(j).getListaEstudantes().get(w).getMatricula());
    	    		System.out.println(listaCursos.get(i).getListaDisciplina().get(j).getListaEstudantes().get(w).getIdade() + " anos");
    	    		System.out.println("----------------------------");     				
    			} 		
    		}
    	}
    	System.out.println("*********Professor*********");
    	for(int i = 0; i < listaCursos.size(); i++) {
    		for(int j = 0; j < listaCursos.get(i).getListaDisciplina().size(); j++) {	
    			for(int w = 0; w < listaCursos.get(i).getListaDisciplina().get(j).getListaEstudantes().size(); w++) {
    	    		System.out.println(listaCursos.get(i).getListaDisciplina().get(j).getProfessor().getNome());
    	    		System.out.println(listaCursos.get(i).getListaDisciplina().get(j).getProfessor().getCpf());
    	    		System.out.println("R$ " + listaCursos.get(i).getListaDisciplina().get(j).getProfessor().getSalario());
    	    		System.out.println(listaCursos.get(i).getListaDisciplina().get(j).getProfessor().getIdade() + " anos");
    	    		System.out.println("----------------------------");     				
    			} 		
    		}
    	}
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
}
