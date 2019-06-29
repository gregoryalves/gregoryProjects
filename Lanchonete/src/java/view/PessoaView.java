package view;

import javax.faces.bean.ManagedBean;

import model.Pessoa;
import repository.PessoaDao;

@ManagedBean
public class PessoaView {

    Pessoa pessoa = new Pessoa();
    PessoaDao dao = new PessoaDao();

    String retorno;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String logar() {
        if (dao.logar(pessoa)) {
            this.retorno = "paginaInicial?faces-redirect=true";
            return retorno;
        } else {
            retorno = "Login ou senha inválidos!";
            return retorno;
        }
    }

}
