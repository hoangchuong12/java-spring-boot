package com.thaihoangchuong.example04.service;

import java.util.List;
import com.thaihoangchuong.example04.entity.Gallery;
public interface  GalleryService {
    Gallery createGallery(Gallery gallery);

    Gallery getGalleryById(Long galleryId);

    List<Gallery> getAllGalleries();

    Gallery updateGallery(Gallery gallery);

    void deleteGallery(Long galleryId);
}
