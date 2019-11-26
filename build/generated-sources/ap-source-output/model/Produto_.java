package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.VendaProduto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-26T00:14:10")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Double> preco;
    public static volatile SingularAttribute<Produto, Integer> estoque;
    public static volatile ListAttribute<Produto, VendaProduto> vendaProduto;
    public static volatile SingularAttribute<Produto, String> foto;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, Integer> id;

}