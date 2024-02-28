import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    private String nome;
    private ArrayList<Estudante> listaEstudantes;
    private Professor professor;
    
    
    public void mostrarDados() {
    	System.out.println("*********Estudantes*********");  	
    	for(int i = 0; i < listaEstudantes.size(); i++) {
    		System.out.println(listaEstudantes.get(i).getNome());
    		System.out.println(listaEstudantes.get(i).getCpf());
    		System.out.println(listaEstudantes.get(i).getMatricula());
    		System.out.println(listaEstudantes.get(i).getIdade()+ " anos");
    		System.out.println("----------------------------");  
    	}
    	if(professor == null) {
    		System.out.println("*********Professor*********");
    	}
    	else {
        	System.out.println("*********Professor*********");
        	System.out.println(professor.getNome());
        	System.out.println(professor.getCpf());
        	System.out.println("R$ " + professor.getSalario());
        	System.out.println(professor.getIdade() + " anos");	
    	}
    	
    }
    public void addEstudante(Estudante estudante) {
    	this.listaEstudantes.add(estudante);
    }
    
	public Disciplina(String nome) {
		this.nome = nome;
		this.listaEstudantes = new ArrayList<Estudante>();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Estudante> getListaEstudantes() {
		return listaEstudantes;
	}
	public void setListaEstudantes(ArrayList<Estudante> listaEstudantes) {
		this.listaEstudantes = listaEstudantes;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
    
    
}
