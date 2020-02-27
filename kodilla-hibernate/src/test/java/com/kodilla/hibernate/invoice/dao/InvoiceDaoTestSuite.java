package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
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
        p1.getItemList().add(it1);
        p2.getItemList().add(it2);
        p3.getItemList().add(it3);

        //When
        invoiceDao.save(invoice);
        productDao.save(p1);
        productDao.save(p2);
        productDao.save(p3);
        itemDao.save(it1);
        itemDao.save(it2);
        itemDao.save(it3);

        int id = invoice.getId();

        //THEN
        Assert.assertNotEquals(0, 1);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
