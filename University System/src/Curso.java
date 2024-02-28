import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    String nome;
    ArrayList<Disciplina> listaDisciplina;
    
    public void addDisciplina(Disciplina disciplina) {
    	listaDisciplina.add(disciplina);
    }
        
    public void mostrarDados() {
    	System.out.println("*********Disciplinas*********");  	
    	for(int i = 0; i < listaDisciplina.size(); i++) {
    		System.out.println(listaDisciplina.get(i).getNome());  		
    	}
    }

	public Curso(String nome) {
		this.nome = nome;
		this.listaDisciplina = new ArrayList<Disciplina>();
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }
}
