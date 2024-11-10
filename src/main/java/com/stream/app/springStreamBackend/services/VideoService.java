package com.stream.app.springStreamBackend.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.stream.app.springStreamBackend.entities.Video;

public interface VideoService {

    // save videor
    Video save(Video video, MultipartFile file);
    
    // get video by id
    Video get(String videoId);

    // get video by title
    Video getByTitle(String title);

    List<Video> getAll();
    
}