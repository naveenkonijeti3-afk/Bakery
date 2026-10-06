package com.bakery.order.controller;
import com.bakery.order.model.*; import com.bakery.order.service.OrderService; import jakarta.validation.Valid; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api") @CrossOrigin(origins="http://localhost:5173") public class OrderController { private final OrderService s; public OrderController(OrderService s){this.s=s;}
 @GetMapping("/products") public List<Product> products(){return s.products();}
 @PostMapping("/orders") public ResponseEntity<Order> create(@Valid @RequestBody Order o){return ResponseEntity.status(HttpStatus.CREATED).body(s.create(o));}
 @GetMapping("/orders") public List<Order> all(){return s.all();} @GetMapping("/orders/{id}") public Order one(@PathVariable Long id){return s.one(id);}
 @PatchMapping("/orders/{id}/status") public Order status(@PathVariable Long id,@RequestParam Order.Status value){return s.status(id,value);}
 @ExceptionHandler(NoSuchElementException.class) ResponseEntity<Map<String,String>> notFound(Exception e){return ResponseEntity.status(404).body(Map.of("message",e.getMessage()));}
 @ExceptionHandler(Exception.class) ResponseEntity<Map<String,String>> bad(Exception e){return ResponseEntity.badRequest().body(Map.of("message","Invalid request. Please check the submitted fields."));}
}
