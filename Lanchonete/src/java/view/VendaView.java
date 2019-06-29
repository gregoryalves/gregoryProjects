package view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Venda;
import javax.faces.bean.ManagedBean;
import model.Produto;
import model.VendaProduto;
import repository.ProdutoDao;
import repository.VendaDao;
import repository.VendaProdutoDao;

@ManagedBean
public class VendaView implements Serializable {

    private static Venda venda = new Venda();
    private static final ProdutoView produto = new ProdutoView();
    private static final ProdutoDao dao = new ProdutoDao();
    private static final VendaDao vDao = new VendaDao();
    private static VendaProduto vendaProduto;
    private static VendaProdutoDao vendaProdutoDao = new VendaProdutoDao();
    private static List<VendaProduto> vendaProdutoLista = new ArrayList<>();
    static double venda1;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void somaTotal(double valor, Produto prod) {

        if (prod.getEstoque() > 0) {
            venda.setTotal(venda.getTotal() + valor);
            prod.setEstoque(prod.getEstoque() - 1);
            prod.setCarrinho(prod.getCarrinho() + 1);

            vendaProduto = new VendaProduto(venda, prod, prod.getCarrinho());
            vendaProdutoLista.add(vendaProduto);
        }

    }

    public void diminuiTotal(double valor, Produto prod) {

        if (prod.getCarrinho() > 0) {
            prod.setEstoque(prod.getEstoque() + prod.getCarrinho());
            produto.zeraCarrinho();
            venda = new Venda();
            vendaProduto = new VendaProduto();
            vendaProdutoLista = new ArrayList<>();

            dao.salvar(prod);
        }

    }

    public void zeraTotal() {
        venda.setTotal(0);

    }

    public String finalizaVenda(List<Produto> prod) {
        String retorno;
        if (venda.getTotal() > 0) {
            venda.setVendaProduto(vendaProdutoLista);
            vDao.salvar(venda);
            
            for (Produto produto1 : prod) {
                dao.salvar(produto1);
            }

            produto.zeraCarrinho();
            venda = new Venda();
            vendaProduto = new VendaProduto();
            vendaProdutoLista = new ArrayList<>();

            retorno = "vendaFinished?faces-redirect=true";
        } else {
            retorno = "vendaErro?faces-redirect=true";
        }
        return retorno;
    }

}
