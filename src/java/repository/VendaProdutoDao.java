package repository;

import model.VendaProduto;

public class VendaProdutoDao {

    public void salvar(VendaProduto o) {
        if (o.getId() == 0) {
            Repository.inserir(o);
        } else {
            Repository.alterar(o);
        }
        Repository.commitar();
    }

    public void excluir(VendaProduto o) {
        Repository.excluir(o);
        Repository.commitar();
    }

}
