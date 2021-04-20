package dz;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// ВАРИАНТ НОМЕР 5, ВВОД-ВЫВОД ВАРИАНТ НОМЕР 2

public class num1 {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        String pathProd = "products.xml";
        JAXBContext context = JAXBContext.newInstance(Products.class);
        Unmarshaller um = context.createUnmarshaller();
        Products prl = (Products) um.unmarshal(new File(pathProd));
        List<Product> products = prl.getProducts();

        String pathSales = "sales.xml";
        JAXBContext context1 = JAXBContext.newInstance(Sales.class);
        Unmarshaller um1 = context1.createUnmarshaller();
        Sales sal = (Sales) um1.unmarshal(new File(pathSales));
        List<Sale> sales = sal.getSales();

        TreeSet<CountProd> tree_set = new TreeSet<CountProd>();

        for (Product pr : products) {
            CountProd cp = new CountProd(pr);
            for (Sale sl : sales) {
                if (sl.isThisProd(cp)) {
                    cp.setCount(cp.getCount()+sl.getCount());
                }
            }
            tree_set.add(cp);
        }

        ArrayList<CountProd> list = new ArrayList<>();
        Iterator it = tree_set.iterator();
        int i = 0;
        while (it.hasNext() && i<5) {
            i++;
            list.add((CountProd) it.next());
        }
        CPList cps = new CPList();
        cps.setCProducts(list);

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("ans1.json"), cps);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    }

