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

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("some product");

        Item item1 = new Item(new BigDecimal(12.2), 2, new BigDecimal(24.4));
        Item item2 = new Item(new BigDecimal(12.6), 1, new BigDecimal(12.6));
        Item item3 = new Item(new BigDecimal(2.2), 4, new BigDecimal(8.8));
        Item item4 = new Item(new BigDecimal(4.0), 5, new BigDecimal(20.0));
        Item item5 = new Item(new BigDecimal(10.5), 2, new BigDecimal(21));
        Item item6 = new Item(new BigDecimal(6.3), 4, new BigDecimal(25.2));

        Invoice invoice = new Invoice("1214082018");

        product.getItems().add(item1);
        product.getItems().add(item2);
        product.getItems().add(item3);
        product.getItems().add(item4);
        product.getItems().add(item5);
        product.getItems().add(item6);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);
        invoice.getItems().add(item6);

        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);
        item4.setProduct(product);
        item5.setProduct(product);
        item6.setProduct(product);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);
        item6.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);

    }
}
