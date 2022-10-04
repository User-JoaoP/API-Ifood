package me.dio.ShoppingCart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import me.dio.ShoppingCart.enumeration.FormPayment;
import lombok.*;
import javax.persistence.*;
import java.util.*;
@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"HibernateLazyInitializer", "handler"})
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Client client;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;
    private Double amount;
    @Enumerated
    private FormPayment FormPayment;
    private boolean closed;


}
