package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Produto;
import model.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-29T12:36:14")
@StaticMetamodel(VendaProduto.class)
public class VendaProduto_ { 

    public static volatile SingularAttribute<VendaProduto, Venda> venda;
    public static volatile SingularAttribute<VendaProduto, Produto> produto;
    public static volatile SingularAttribute<VendaProduto, Integer> id;

}