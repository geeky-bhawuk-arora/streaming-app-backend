package com.stream.app.springStreamBackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "yt_videos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Video {

    @Id
    private String videoId;

    private String title;

    private String description;

    private String contenntType;

    private String filePath;

    @ManyToOne
    private String course;

}