package PooHe;

public class App {
    Pessoas pessoa1 = new Pessoas();
        pessoa1.setNome("Rhenan");
        System.out.println("Nome: " + pessoa1.getNome());
        pessoa1.setCpf("50769042821");
        System.out.println("Cpf: " + pessoa1.getCpf());
        pessoa1.setIdade(22);
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("==========================");
        Alunos alunos1 = new Alunos();// criou o obj
        alunos1.setnMatricula(22);
        System.out.println("Número da Matrícula: " + alunos1.getnMatricula());
        alunos1.setCurso("Desenvolvimento de Sistema");
        System.out.println("Curso: " + alunos1.getCurso());
        alunos1.setMediaSemestre(90);
        System.out.println("Nota Média: " + alunos1.getMediaSemestre());
        alunos1.setTurma("DevTarde ");
        System.out.println("Turma: " + alunos1.getTurma());
        System.out.println("============================");
        Funcionarios funcionario1 = new Funcionarios();
        funcionario1.setFuncao("Professor");
        System.out.println("Função: " + funcionario1.getFuncao());
        funcionario1.setTurno("Manhã");
        System.out.println("Turno: " + funcionario1.getTurno());
        System.out.println("================================");
        Professores professor1 = new Professores();
        professor1.setnRe(6610);
        System.out.println("Seu RE: " + professor1.getnRe());
        professor1.setMateria("Administração");
        System.out.println("Matéria: " + professor1.getMateria());
}
