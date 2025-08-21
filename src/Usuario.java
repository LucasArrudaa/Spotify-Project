public class Usuario {
 // Pode se cadastrar com nome e e-mail.
    String nome;
    String email;
    String password;

    public Usuario(String nome, String email, String password) {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome= nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");


} }
