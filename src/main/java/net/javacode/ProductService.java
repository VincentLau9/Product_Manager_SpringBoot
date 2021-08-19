/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javacode;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;
    
    
    public List<Product> listAll(){
        return repo.findAll();
    }
    
    public void save(Product product){
        repo.save(product);
    }
    
    public Product get(Long id){
        return repo.findById(id).get();
    }
    
    public void delete(Long id){
        repo.deleteById(id);
    }
}
