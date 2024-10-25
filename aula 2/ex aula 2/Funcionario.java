public class Funcionario {
  private String nome;
  private int idade;
  private String salario;

  //gatter para o nome
  public String getNome(){
    return nome;
  }

  //setter para o nome
  public void setNome(String nome){
    this.nome = nome;
  }
  // getter para a idade
  public int getIdade(){
    return idade;

  }
  //setter para a idade
  public void setIdade(int idade){
    this.idade = idade;
  }
  //getter para o salario
  public String getSalario(){
    return salario;
  }
  //setter para o salario
  public void setSalario(String salario){
    this.salario = salario;

  }

}