

class Pessoa{
    public String nome;
    public String email;

    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void logar(){
        System.out.println(nome + " Usuário logado");
    }

    
}