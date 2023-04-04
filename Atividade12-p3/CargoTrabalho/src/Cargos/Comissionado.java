package Cargos;

public class Comissionado extends Empregado {

    private double totalVenda;
    private double totalComissao;

    public Comissionado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public double vencimento(double salario){
        salario = totalVenda + totalComissao;
        return salario;
    }
    
}
