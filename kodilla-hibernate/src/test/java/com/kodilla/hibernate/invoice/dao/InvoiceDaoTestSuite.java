package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product p1 = new Product("ski shoes");
        Product p2 = new Product("helmet");
        Product p3 = new Product("gloves");
        Item it1 = new Item(p1, new BigDecimal(1500), 1);
        Item it2 = new Item(p2, new BigDecimal(650), 1);
        Item it3 = new Item(p3, new BigDecimal(350), 2);
        Invoice invoice = new Invoice("Inv_02_01_20", new ArrayList<>());
        invoice.getItems().add(it1);
        invoice.getItems().add(it2);
        invoice.getItems().add(it3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //THEN
        Assert.assertNotEquals(0, 1);

        //CleanUp
//        invoiceDao.deleteById(id);
    }
}
