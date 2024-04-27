
class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters para nome e CPF
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

class Aluno extends Pessoa {
    private String ra; // Registro de Aluno

    public Aluno(String nome, String cpf, String ra) {
        super(nome, cpf);
        this.ra = ra;
    }

    // Getter para RA
    public String getRa() {
        return ra;
    }
}

public class Tarefa {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno = new Aluno("Lucas Mendes", "451.733.698-09", "G74GHA2");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("RA: " + aluno.getRa());
    }
}
