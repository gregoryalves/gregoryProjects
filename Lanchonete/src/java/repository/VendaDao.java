package repository;

import model.Venda;

public class VendaDao {

    public void salvar(Venda venda) {
        if (venda.getId() == 0) {
            Repository.inserir(venda);
        } else {
            Repository.alterar(venda);
        }
        Repository.commitar();
    }

    public void excluir(Venda venda) {
        Repository.excluir(venda);
        Repository.commitar();
    }

}
