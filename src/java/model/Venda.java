package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
    @NamedQuery(name = "Venda.FindALL", query = "SELECT v FROM Venda v")})
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date data = new Date();
    @Column
    private double total;
    @OneToMany(mappedBy = "venda", cascade = CascadeType.PERSIST)
    private List<VendaProduto> vendaProduto;

    public Venda() {
    }

    public Venda(int id, Date data, double total) {
        this.id = id;
        this.data = data;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<VendaProduto> getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(List<VendaProduto> vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", data=" + data + ", total=" + total + '}';
    }

}
