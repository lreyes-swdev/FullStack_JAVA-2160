package clase2java;

public class Ingreso {

    private String usuario, pass;
    private String miUsuario = "Luis";
    private String miPass = "123456";

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setUsuario(String us) {
        usuario = us;
    }

    public boolean validar() {
        return usuario.equals(miUsuario) && pass.equals(miPass);
    }

}
