package view;

import javax.faces.bean.ManagedBean;
import model.VendaProduto;

@ManagedBean
public class VendaProdutoView {

    VendaProduto vendaProduto = new VendaProduto();

    public VendaProduto getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(VendaProduto vendaProduto) {
        this.vendaProduto = vendaProduto;
    }
    
    

}
