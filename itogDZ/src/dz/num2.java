package dz;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;
import java.util.TreeSet;

// ВАРИАНТ НОМЕР 2, ВВОД-ВЫВОД ВАРИАНТ НОМЕР 1

public class num2 {
    public static void main(String[] args) throws JAXBException {
        String pathSales = "sales.xml";
        JAXBContext context1 = JAXBContext.newInstance(Sales.class);
        Unmarshaller um1 = context1.createUnmarshaller();
        Sales sal = (Sales) um1.unmarshal(new File(pathSales));
        List<Sale> sales = sal.getSales();

        TreeSet<String> dates = new TreeSet<>();
        int amount = 0;
        for (Sale sl : sales) {
            dates.add(sl.getDate());
            amount+=sl.getCount();
        }
        double ans = (double) amount/dates.size();

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("ans2.json"), ans);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
