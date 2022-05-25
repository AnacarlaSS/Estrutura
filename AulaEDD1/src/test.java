
public class test {

	public static void main(String[] args) {
		Aluno a1 =new Aluno("angel");
		Aluno a2 =new Aluno("angela");
		
		vetor lista = new vetor();
		
		System.out.println("total de alunos"+ lista.tamanho());
		 
		lista.add(a1);
		System.out.println("total de alunos"+ lista.tamanho());
		
		lista.add(a2);
		System.out.println("total de alunos"+ lista.tamanho());
		
		lista.add(a1);
		System.out.println(lista);
		
		lista.add(a1);
		System.out.println( lista.contem(a1));
		
		System.out.println(lista.pega(0));
	}

}
