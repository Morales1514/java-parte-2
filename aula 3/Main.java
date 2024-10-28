public class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("João", 25);
    Pessoa p2 = new Pessoa("Pedro", 85);
    Pessoa p3 = new Pessoa("Judas", 65);

    System.out.println("A pessoa1 é igual a pessoa2?" + p1.equals(p2));
    System.out.println("A pessoa1 é igual a pessoa3?" + p1.equals(p3));
  }


}