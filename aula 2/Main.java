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

    pessoa Pessoa = new pessoa();
    Pessoa.setNome(nome);
    Pessoa.setIdade(idade);
    Pessoa.setSalario(salario);

    System.out.println("Nome: " + Pessoa.getNome());

    System.out.println("Idade: " + Pessoa.getIdade());

    System.out.println("Salário: " + Pessoa.getSalario());
    scanner.close();
  }

}