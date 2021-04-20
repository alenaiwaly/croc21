package dz;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CPList {
    private List<CountProd> cps = new ArrayList();

    public void setCProducts(List<CountProd>cps1) {
        this.cps = cps1  ;
    }

    public List<CountProd> getCProducts(){
        return cps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPList cpList = (CPList) o;
        return Objects.equals(cps, cpList.cps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cps);
    }
}
