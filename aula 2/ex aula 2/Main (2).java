import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nome do cliente: ");
    String nome = scanner.nextLine();

    System.out.println("Salário do cliente: ");
    String salario = scanner.nextLine();

    System.out.println("Idade do cliente: ");
    int idade = scanner.nextInt();
 
    Funcionario funcionario = new Funcionario();
    funcionario.setNome(nome);
    funcionario.setIdade(idade);
    funcionario.setSalario(salario);

    System.out.println("Nome: " + funcionario.getNome());

    System.out.println("Idade: " + funcionario.getIdade());

    System.out.println("Salário: " + funcionario.getSalario());
    scanner.close();
  }

}