package dz;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.NONE)
public class Products {
    @XmlElement(name = "product")
    private List<Product> products = new ArrayList();

    public void setProducts(List<Product>prlist1) {
        this.products = prlist1;
    }

    public List<Product> getProducts(){
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products1 = (Products) o;
        return Objects.equals(products, products1.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
