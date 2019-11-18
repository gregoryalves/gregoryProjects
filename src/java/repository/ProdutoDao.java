package repository;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class ProdutoDao {

    public void salvar(Produto p) {
        if (p.getId() == 0) {
            Repository.inserir(p);
        } else {
            Repository.alterar(p);
        }
        Repository.commitar();
    }

    public void excluir(Produto p) {
        Repository.excluir(p);
        Repository.commitar();
    }

    public List<Produto> buscaTotal() {
        List<Produto> produtos = new ArrayList<>();

        try {
            produtos = Repository.getEm().createQuery("SELECT p FROM Produto p").getResultList();
        } catch (Exception e) {

        }

        return produtos;
    }

}
