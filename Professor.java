public class Professor extends Pessoa implements Exibivel {
    private String departamento;

    public Professor(String nome, String cpf, String departamento) {
        super(nome, cpf);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(this.toString());
    }
}