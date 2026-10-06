package com.bakery.order.service;
import com.bakery.order.model.*; import com.bakery.order.repository.*; import org.springframework.stereotype.Service; import java.util.*;
@Service public class OrderService { private final OrderRepository orders; private final ProductRepository products; public OrderService(OrderRepository o,ProductRepository p){orders=o;products=p;}
 public List<Product> products(){if(products.count()==0){products.save(new Product("Chocolate Cake",650,"Cakes"));products.save(new Product("Red Velvet Cake",750,"Cakes"));products.save(new Product("Brownie Box",350,"Brownies"));products.save(new Product("Cupcake Box",300,"Cupcakes"));}return products.findAll();}
 public Order create(Order o){o.setTotal(o.getUnitPrice()*o.getQuantity());o.setStatus(Order.Status.PENDING);return orders.save(o);} public List<Order> all(){return orders.findAll();} public Order one(Long id){return orders.findById(id).orElseThrow(()->new NoSuchElementException("Order not found: "+id));}
 public Order status(Long id,Order.Status s){Order o=one(id);o.setStatus(s);return orders.save(o);}
}
