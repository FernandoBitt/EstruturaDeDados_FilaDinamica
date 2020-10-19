package view;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ListaCurso lista = new ListaCurso();
		int op = 0;
		
		while(op!=9) {	
			op= Integer.parseInt(JOptionPane.showInputDialog("Digite 1: adicionar ao final da fila" + "\nDigite 2: remove do início da fila"
															+"\nDigite 3: para mostrar a lista"+ "\nDigite 9: para sair"));
			switch (op) {		
			case 1:
				lista.addFinal(lista.cadastra());
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Removido -> " + lista.removeInicio());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,lista.percorre());
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Saindo");
				break;
				
			default:
				break;
				
			}
		}	
		
	}
}

