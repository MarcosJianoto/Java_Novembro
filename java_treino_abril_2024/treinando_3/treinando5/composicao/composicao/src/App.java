public class App {

  public static void main(String[] args) throws Exception {
    //categorias de classes, por questão de organização...
    //Views, Controllers, Entities, Services, Repositories.
    //OrderRepository, cada 1 é dividido... realmente é feito diversos "objetos" separados.
    //tem-um ou tem-vários..
    //------------------------------------------------------
    //Vantagens -> Organização, divisão de responsabilidades.
    //Coesão, Flexibilidade e Reuso.

    Funcionario funcionario1 = new Funcionario();
    Funcionario funcionario2 = new Funcionario();

    funcionario1.setNome("João");
    funcionario1.setSalario(1500.00f);

    funcionario2.setNome("Pedro");
    funcionario2.setSalario(1500.00f);

    System.out.println("Nome do funcionario: " + funcionario1.getName());
    System.out.println("salario do funcionario: " + funcionario1.getSalario());

    Endereco endereco1 = new Endereco(
      "Pedro",
      50,
      "jardim",
      "auri",
      "sp",
      15500000
    );
    Endereco endereco2 = new Endereco(
      "Pedro Alveres",
      53,
      "jardim lala",
      "joana darc",
      "sp",
      1500000
    );
    //System.out.println(funcionario1.getEndereco().getBairro());

    funcionario1.setEndereco(endereco1);
    funcionario2.setEndereco(endereco2);
    funcionario1.getEndereco().setBairro("Marcos");

    System.out.println(funcionario1.getEndereco());
  }
}
