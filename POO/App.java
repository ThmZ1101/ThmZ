package POO;

public class App {
    public static void main(String[] args) {
        RegistraAluno aluno1 = new RegistraAluno();
        aluno1.setNome("ThmZ");
        System.out.println("Nome:"+aluno1.getNome());
        aluno1.setEndereco("Casa do krl");
        System.out.println("Endereço:"+aluno1.getEndereco());
        aluno1.setIdade(16);
        System.out.println("Nome:"+aluno1.getIdade());
        aluno1.setNotaCiencias(8);
        aluno1.setNotaPortugues(7);
        aluno1.setNotaMatematica(6);
        System.out.println("Media:"+aluno1.getMedia());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
         
        RegistraAluno aluno2 = new RegistraAluno();
        aluno2.setNome("ZmhT");
        System.out.println("Nome:"+aluno2.getNome());
        aluno2.setEndereco("Casa do krl");
        System.out.println("Endereço:"+aluno2.getEndereco());
        aluno2.setIdade(26);
        System.out.println("Nome:"+aluno2.getIdade());
        aluno2.setNotaCiencias(2);
        aluno2.setNotaPortugues(4);
        aluno2.setNotaMatematica(6);
        System.out.println("Media:"+aluno2.getMedia());
    }
    
}
