import java.util.Arrays;

public class vetor {
   private Aluno alunos[] = new Aluno[100];
    private int total=0;
    
   public void add(Aluno aluno) {
	   //receber luno e add no array verificando se a posiçao esta null
      this.alunos[total]= aluno;
      total=total +1;
	   
/*for (int i = 0; i < alunos.length; i++) {
if (alunos[i] == null) {
alunos[i] = aluno;
break;//sair do for
}}*/
	   
   }
   
   public Aluno pega(int posicao) {
	   //recebe uma posiçao e devolve o aluno
	   return this.alunos[posicao];
	   }
   
   public void remove(int posicao ) {
	   //remove aluno pela posiçao
	   this.alunos[posicao]=null;
   }
   
   public boolean contem(Aluno aluno) {
	   //descobre se o aluno esta ou nao na lista
	   for (int i = 0; i < total; i++) {
		if (aluno.equals(alunos[i])) {
			return true;
		}
	}
	   return false;
   }
   public int tamanho() {
	   //devolve a quantidade de aulnos no vetor
	   return this.total;
	   //nao usaremos .lenph pq queromos saber quantos objetos temos no vetor e nao o tamanho do vetor.
   }
   
   public String toString() {
	   return Arrays.toString(this.alunos);
	   //faclita a vizualizaçao do array
   }
}
