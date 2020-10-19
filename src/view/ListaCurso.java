package view;

import javax.swing.JOptionPane;

public class ListaCurso {
	private NO inicio;
	
	public ListaCurso() {
		inicio =null;
	}
	
	
	public  Curso cadastra() {
		Curso curso = new Curso();
		curso.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do curso")));
		curso.setNome(JOptionPane.showInputDialog("Digite o nome do curso"));
		curso.setAreaCurso(JOptionPane.showInputDialog("Digite a área do curso"));
		curso.setQuantidadeSemestre(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres")));
		curso.setPeriodo(JOptionPane.showInputDialog("Digite o período"));
		return curso;
	}

	public void addFinal(Curso curso){
		if (inicio==null){
			NO n=new NO(curso);
			inicio=n;
		}
		else{
			NO aux=inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			NO n=new NO(curso);
			aux.prox=n;
		}
	}
	
	public Curso removeInicio(){
		Curso r=null;
		if (inicio==null){
			JOptionPane.showMessageDialog(null,"Lista Vázia");
		}
		else{
			r=inicio.curso;
			inicio=inicio.prox;
		}
		return r;
	}
	
	
	public String percorre(){
		NO aux=inicio;
		String r=" ";
		while(aux!=null){
			r=r+"\n"+aux.curso;
			aux=aux.prox;
		}
		return r;
	}
}
