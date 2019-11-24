package test;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Pessoa;
import model.Produto;
import model.Venda;
import model.VendaProduto;
import repository.PessoaDao;

public class LoginTest {

    public static void main(String[] args) {

//        Venda venda = new Venda();
//        Produto produto = new Produto();
//        Produto produto2 = new Produto();
//        VendaProduto vendaProduto;
//        List<VendaProduto> lista = new ArrayList<>();
//
//        produto.setNome("Banana");
//        produto.setCarrinho(20);
//
//        produto2.setNome("Iphone");
//        produto2.setCarrinho(10);
//
//        venda.setTotal(500);
//
//        vendaProduto = new VendaProduto(venda, produto, 40);
//
//        lista.add(vendaProduto);
//
//        vendaProduto = new VendaProduto(venda, produto2, 100);
//
//        lista.add(vendaProduto);
//
//        for (VendaProduto prod : lista) {
//            System.out.println(prod.getProduto().getNome().toString());
//        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LanchonetePU");
        EntityManager em = emf.createEntityManager();
//
//        Produto prod = new Produto();
//        prod.setNome("Maçã");
//
//        Produto prod2 = new Produto();
//        prod2.setNome("Banana");
//
//        List<Produto> produtos = new ArrayList<>();
//        produtos.add(prod);
//        produtos.add(prod2);
//
//        Venda vend = new Venda();
//        vend.setTotal(350);
//        vend.setProduto(produtos);
//
//        em.getTransaction().begin();
//        em.persist(vend);
//        em.persist(prod);
//        em.persist(prod2);
//        em.getTransaction().commit();
    }
}
