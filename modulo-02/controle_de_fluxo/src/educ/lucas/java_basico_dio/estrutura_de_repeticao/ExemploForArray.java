package educ.lucas.java_basico_dio.estrutura_de_repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }

        for(String nome : alunos){
            System.out.println("nome do aluno é " + nome);
        }
    }
}
