package com.example.casinogames.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "games")
@Data
public class Game {
    @Id
    private String id;
    private String name;
    private String description;
    private String developer;
}
