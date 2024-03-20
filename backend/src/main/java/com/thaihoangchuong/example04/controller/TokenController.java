package com.thaihoangchuong.example04.controller;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thaihoangchuong.example04.entity.Token;
import com.thaihoangchuong.example04.service.TokenService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/tokens")
@CrossOrigin(origins = "http://localhost:3000")
public class TokenController {
    private TokenService tokenService;

    // Create Token rest API
    @PostMapping
    public ResponseEntity<Token> createToken(@RequestBody Token token) {
        Token savedToken = tokenService.createToken(token);
        return new ResponseEntity<>(savedToken, HttpStatus.CREATED);
    }

    // Get Token by id REST API
    // http://localhost:8080/api/Tokens/1
    @GetMapping("{id}")
    public ResponseEntity<Token> getTokenById(@PathVariable("id") Long tokenId) {
        Token token = tokenService.getTokenById(tokenId);
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    // Get all Token REST API
    // http://localhost:8080/api/Tokens
    @GetMapping
    public ResponseEntity<List<Token>> getAllTokens() {
        List<Token> tokens = tokenService.getAllTokens();
        return new ResponseEntity<>(tokens, HttpStatus.OK);
    }

    // Update Token REST API
    // http://localhost:8080/api/Tokens/1
    @PutMapping("{id}")
    public ResponseEntity<Token> updateToken(@PathVariable("id") Long tokenId, @RequestBody Token token) {
        token.setId(tokenId);
        Token updateToken = tokenService.updateToken(token);
        return new ResponseEntity<>(updateToken, HttpStatus.OK);
    }

    // Delete Token REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteToken(@PathVariable("id") Long tokenId) {
        tokenService.deleteToken(tokenId);
        return new ResponseEntity<>("Token successfully deleted!", HttpStatus.OK);
    }
}
