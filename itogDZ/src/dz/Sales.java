package dz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "sales")
@XmlAccessorType(XmlAccessType.NONE)
public class Sales {
    @XmlElement(name = "sale")
    private List<Sale> sales = new ArrayList();

    public void setSales(List<Sale>sales1) {
        this.sales = sales;
    }

    public List<Sale> getSales(){
        return sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sales sales1 = (Sales) o;
        return Objects.equals(sales, sales1.sales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sales);
    }
}
