package com.example.casinogames.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "comments")
@Data
public class Comment {
    @Id
    private String id;
    private String gameId;
    private String userId;
    private String text;
    private Date date;
}
