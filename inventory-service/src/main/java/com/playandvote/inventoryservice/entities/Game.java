package com.playandvote.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;


@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String information;

    @ManyToOne()
    @JoinColumn(name="company_id")
    private Company company;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;



    //TODO : Add category and Company Later

}
