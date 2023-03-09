public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario lari = new Gerente();
        lari.setNome("larissa");
        lari.setCpf("000.000.000-00");
        lari.setSalario(2600.00);


        System.out.println(lari.getNome());
        System.out.println(lari.getBonificacao());



    }
}
