public public class Pessoa {

    private String nome;
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    public String verificarNome(){        
       if(this.nome.equals("ADMIN")){
         return "É administrador";
       }else{
        return "Não é administrador";
       }
    }    
} {
    
}
