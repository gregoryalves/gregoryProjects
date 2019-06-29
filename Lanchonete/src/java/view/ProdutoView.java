package view;

import java.util.List;
import model.Produto;
import javax.faces.bean.ManagedBean;
import javax.servlet.http.Part;
import repository.ProdutoDao;
import util.UploadUtils;

@ManagedBean
public class ProdutoView {

    private Produto produto = new Produto();
    private ProdutoDao dao = new ProdutoDao();
    private List<Produto> produtos = dao.buscaTotal();
    private Part file1;

    public ProdutoDao getDao() {
        return dao;
    }

    public void setDao(ProdutoDao dao) {
        this.dao = dao;
    }

    public Part getFile1() {
        return file1;
    }

    public void setFile1(Part file1) {
        this.file1 = file1;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void salvar() {

        try {
            dao.salvar(produto);
            produtos = dao.buscaTotal();

        } catch (Exception e) {
            System.out.println("Erro!");
        }

    }

    public void alterar(Produto produto) {

        dao.salvar(produto);
        produtos = dao.buscaTotal();

    }

    public void excluir(Produto produto) {

        try {
            dao.excluir(produto);
            produtos = dao.buscaTotal();
        } catch (Exception e) {
            produtos = dao.buscaTotal();
        }
    }

    public void zeraCarrinho() {

        for (Produto produto1 : dao.buscaTotal()) {
            produto1.setCarrinho(0);
            dao.salvar(produto1);
        }

    }

}
