package dz;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name="product")
public class Sale {
    private int saleid;
    private int sellerid;
    private int productid;
    private int count;
    private String date;

    public int getCount() {
        return count;
    }

    public int getProductid() {
        return productid;
    }

    public int getSaleid() {
        return saleid;
    }

    public int getSellerid() {
        return sellerid;
    }

    public String getDate() {
        return date;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    boolean isThisProd(Product p) {
        return (this.getProductid() == p.getId());
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleid=" + saleid +
                ", sellerid=" + sellerid +
                ", productid=" + productid +
                ", count=" + count +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return saleid == sale.saleid && sellerid == sale.sellerid && productid == sale.productid && count == sale.count && Objects.equals(date, sale.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleid, sellerid, productid, count, date);
    }
}
