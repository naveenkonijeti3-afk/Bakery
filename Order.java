package com.bakery.order.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDate;
@Entity @Table(name="orders") public class Order {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String customerName; @NotBlank @Email private String contactEmail; @NotBlank private String phone;
 @NotBlank private String productName; @Positive private int quantity; @NotBlank private String customization;
 @FutureOrPresent private LocalDate deliveryDate; @NotBlank private String deliveryAddress; @Positive private double unitPrice; private double total;
 @Enumerated(EnumType.STRING) private Status status=Status.PENDING;
 public enum Status {PENDING,CONFIRMED,BAKING,OUT_FOR_DELIVERY,DELIVERED,CANCELLED}
 public Long getId(){return id;} public String getCustomerName(){return customerName;} public void setCustomerName(String v){customerName=v;} public String getContactEmail(){return contactEmail;} public void setContactEmail(String v){contactEmail=v;} public String getPhone(){return phone;} public void setPhone(String v){phone=v;} public String getProductName(){return productName;} public void setProductName(String v){productName=v;} public int getQuantity(){return quantity;} public void setQuantity(int v){quantity=v;} public String getCustomization(){return customization;} public void setCustomization(String v){customization=v;} public LocalDate getDeliveryDate(){return deliveryDate;} public void setDeliveryDate(LocalDate v){deliveryDate=v;} public String getDeliveryAddress(){return deliveryAddress;} public void setDeliveryAddress(String v){deliveryAddress=v;} public double getUnitPrice(){return unitPrice;} public void setUnitPrice(double v){unitPrice=v;} public double getTotal(){return total;} public void setTotal(double v){total=v;} public Status getStatus(){return status;} public void setStatus(Status v){status=v;}
}
