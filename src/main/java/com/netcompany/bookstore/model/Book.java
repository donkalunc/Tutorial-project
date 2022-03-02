package com.netcompany.bookstore.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
//
//    @Column
//    private String author;
//
//    @Column
//    private String genre;
//
//    @Column
//    private String rating;

}
