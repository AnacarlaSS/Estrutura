
public class Aluno {
      private String nome;
      
      public Aluno(String nome) {
    		this.nome = nome;
    	}
      
      public String getNome () {
    	  return this.nome;
      }
      
      public boolean equals(Object obj) {
    	  Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
		//serao iguais se tiverem o mesmo nome
	}
      
     public String toString() {
    	 return this.nome;
     }
}


