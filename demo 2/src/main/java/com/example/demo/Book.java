package com.example.demo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Book {
    private Long id;
    private String title;
    private String author;
    private double price;
}
