package Cargos;

public class Horista extends Empregado {

    private double precoHora;
    private double horasTrabalhadas;

    public Horista(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public double vencimento(double salario){
        salario = precoHora * horasTrabalhadas;
        return salario;
    }
    
}
