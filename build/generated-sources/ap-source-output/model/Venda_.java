package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.VendaProduto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-25T00:48:17")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Double> total;
    public static volatile ListAttribute<Venda, VendaProduto> vendaProduto;
    public static volatile SingularAttribute<Venda, Date> data;
    public static volatile SingularAttribute<Venda, Integer> id;

}