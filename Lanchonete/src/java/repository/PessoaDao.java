package repository;

import model.Pessoa;

public class PessoaDao {

    public void Salvar(Pessoa p) {
        if (p.getId() == 0) {
            Repository.inserir(p);
        } else {
            Repository.alterar(p);
        }
        Repository.commitar();
    }

    public void excluir(Pessoa p) {
        Repository.excluir(p);
        Repository.commitar();
    }

    public boolean logar(Pessoa p) {
        boolean retorno;
        try {
            Repository.getEm().createQuery("SELECT p FROM Pessoa p where p.login = :login and p.senha= :senha").
                    setParameter("login", p.getLogin()).setParameter("senha", p.getSenha()).getSingleResult();
            retorno = true;
        } catch (Exception e) {
            retorno = false;
        }

        return retorno;
    }
}
