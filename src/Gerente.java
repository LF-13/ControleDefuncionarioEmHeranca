//Gerente é um Funcionario, Gerente herda da class Funcionario,
// assina o contrato Autenticavel, é um Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticaoUtil();
    }


    public double getBonificacao() {
        System.out.println("Chamando o método de Bonificacao do gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);

    }
}