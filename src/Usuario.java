public class Usuario {
 // Pode se cadastrar com nome e e-mail.
    String nome;
    String email;
    String password;
    String nomeplaylist;

//   public Usuario(String nome, String email, String password, String nomeplaylist) {
    public Usuario(String nome, String email, String password, String nomeplaylist) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.nomeplaylist = nomeplaylist;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}




