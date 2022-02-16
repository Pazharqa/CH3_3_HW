package com.example.ch3_3_hw.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@ToString
@Component

public class Post {
    private Long id;
    private String title;
    private String shortContent;
    private String content;
    private String pictureURL; //Внешняя ссылка на картину
    private String postDate; // Для текущего времени можно инициализировать объект - new Timestamp(System.currentTimeMillis())

    public Post() {
        System.out.println("Bean Post was created");
    }
}
