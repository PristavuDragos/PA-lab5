/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_lab5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author Dragos
 */
public class Pa_Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InvalidCatalogException, FileNotFoundException, ClassNotFoundException, URISyntaxException
    {
        Catalog c = new Catalog("CatalogulMeu","catalog.ser");
        CatalogUtil cu=new CatalogUtil();
        Document d1=new Document("test1", "tester1",
  "C:\\Users\\Dragos\\Documents\\NetBeansProjects\\Pa_Lab5\\test.ser");
        Document d2=new Document("java1", "Java Course 1",
  "https://profs.info.uaic.ro/~acf/java/slides/en/intro_slide_en.pdf");
        Document d3=new Document("test2","tester2","https://profs.info.uaic.ro/~acf/java/labs/lab_05.html");
        c.add(d1);
        c.add(d2);
        c.add(d3);
        cu.save(c);
        Catalog alt=cu.load("catalog.ser");
        Document testdoc=alt.findById("test2");
        cu.view(testdoc);
    }
}
