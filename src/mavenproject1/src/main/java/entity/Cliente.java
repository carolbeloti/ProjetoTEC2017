
package entity;

 
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
/**
*
* @author Camila 
*/
@Entity
public class Cliente implements Serializable {
 
@Id
@GeneratedValue
private long id;
private String nome;
private String cpf;
private String rua;
private String cep;
private String bairro;
private int id_cidade;
private String telefone;
 public Cliente() {
     
        
    }
 

    public Cliente(long id, String nome, String cpf, String rua, String cep, String bairro, int id_cidade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.id_cidade = id_cidade;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCp(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

   

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.cpf);
        hash = 61 * hash + Objects.hashCode(this.rua);
        hash = 61 * hash + Objects.hashCode(this.cep);
        hash = 61 * hash + Objects.hashCode(this.bairro);
        hash = 61 * hash + this.id_cidade;
        hash = 61 * hash + Objects.hashCode(this.telefone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_cidade != other.id_cidade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }
    
    
    
     @Override
    public String toString() {
        return "cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rua=" + rua + ", cep=" + cep + ", bairro=" + bairro + ", id_cidade=" + id_cidade + ", telefone=" + telefone + '}';
    }


}
 

 