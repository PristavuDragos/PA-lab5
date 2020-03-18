/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_lab5;
import java.util.*;
import java.io.Serializable;
/**
 *
 * @author Dragos
 */
public class Catalog implements Serializable {
    private String name;
    private String path;
    private List<Document> documents=new ArrayList<>();

    public Catalog() {
    }

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public void add(Document doc)
    {
        documents.add(doc);
    }
    
    public Document findById(String id) 
    {
        return documents.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

}
