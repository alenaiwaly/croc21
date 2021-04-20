package dz;

import java.util.Objects;

public class CountProd extends Product implements Comparable<CountProd>{
    private int count=0;


    public CountProd(Product p){
        super(p);
    }

    public void setCount(int count) {
        this.count = count;
    }


    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(CountProd o) {
        return (-Integer.compare(count,o.getCount()));
    }
    public String toString() {
        return "name: " + this.getName() + ", count: " + count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountProd countProd = (CountProd) o;
        return count == countProd.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
