package Controller;

import java.io.IOException;
import Model.Usuario;
import Model.UsuarioModel;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginController {

    String login, senha, mensagem;
    public LoginController(){
    }
   public void verLogin() throws SQLException, IOException{
        if(this.login.equals("") || this.senha.equals("")){
            this.setMensagem("Preencha os campos!!");
        }else{
            if(new UsuarioModel().verLogin(this.login, this.senha) != null){
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioLogado", login);
                FacesContext.getCurrentInstance().getExternalContext().redirect("pageInicial.xhtml");
            }else{
                this.setMensagem("Usuario não cadastrado!"); 
            }
        }
    }   

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
   
}
