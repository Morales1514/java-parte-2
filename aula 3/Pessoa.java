class Pessoa{
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  //sobreescrevendo o metodo equals
  @Override
  public boolean equals(Object obj){
    if( this == obj){
      return true;
    }
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Pessoa outraPessoa = (Pessoa) obj;
    return idade == outraPessoa.idade && nome.equals(outraPessoa.nome);
  }
}