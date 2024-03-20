package com.thaihoangchuong.example04.controller;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.thaihoangchuong.example04.entity.Gallery;
import com.thaihoangchuong.example04.service.GalleryService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/gallery")
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:3001" }, exposedHeaders = "Content-Range")
public class GalleryController {
    private final GalleryService galleryService;

    @PostMapping
    public ResponseEntity<Gallery> createGallery(@RequestBody Gallery gallery) {
        Gallery savedGallery = galleryService.createGallery(gallery);
        return new ResponseEntity<>(savedGallery, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Gallery> getGalleryById(@PathVariable("id") Long galleryId) {
        Gallery gallery = galleryService.getGalleryById(galleryId);
        return new ResponseEntity<>(gallery, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Gallery>> getAllGalleries() {
        List<Gallery> galleries = galleryService.getAllGalleries();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Range", "items 0-" + galleries.size()+"/" + galleries.size());
        
        return ResponseEntity.ok().headers(headers).body(galleries);
    }

    @PutMapping("{id}")
    public ResponseEntity<Gallery> updateGallery(@PathVariable("id") Long galleryId,
                                                  @RequestBody Gallery gallery) {
        gallery.setId(galleryId);
        Gallery updatedGallery = galleryService.updateGallery(gallery);
        return new ResponseEntity<>(updatedGallery, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteGallery(@PathVariable("id") Long galleryId) {
        galleryService.deleteGallery(galleryId);
        return new ResponseEntity<>("Gallery successfully deleted", HttpStatus.OK);
    }
}
