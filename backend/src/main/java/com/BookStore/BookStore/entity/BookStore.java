package com.BookStore.BookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String auther;
    private String price;

    public BookStore(String name, String auther, String price) {
        this.name = name;
        this.auther = auther;
        this.price = price;
    }
}
