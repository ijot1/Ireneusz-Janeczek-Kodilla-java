package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {
    @Test
    public void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
//        ReaderConfig readerConfig = new ReaderConfig();
        Reader reader = (Reader) context.getBean(Reader.class);

        //When & Then
        reader.read();
    }
}
