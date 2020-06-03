public class Pessoa{

   private String nome,endereco,sexo,esporte;
   private boolean vegetariana;
   public int idade;
   
   public Pessoa(){
      this.nome="nome";
      this.idade=0;
      this.sexo="M";
      this.endereco="endereco";
      this.vegetariana= false;
      this.esporte="esporte";
   }
   
   public String getNome(){
      return nome;
   }
   public String getSexo(){
      return sexo;
   }
   public String getEndereco(){
      return endereco;
   }
   public String getEsporte(){
      return esporte;
   }
   public boolean getVegetariana(){
      return vegetariana;
   }
   public int getIdade(){
      return idade;
   }
   
   public void setNome( String nome){
      this.nome=nome;
   }
   public void setIdade(int idade){
      this.idade=idade;
   }
   public void setSexo(String sexo){
      this.sexo=sexo;
   }
   public void setEndereco(String endereco){
      this.endereco=endereco;
   }
   public void setVegetariana(boolean vegetarian){
      this.vegetariana=vegetariana;
   }
   public void setEsporte(String esporte){
      this.esporte=esporte;
   }
   
   
 }