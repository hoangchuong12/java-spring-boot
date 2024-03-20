package com.thaihoangchuong.example04.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.thaihoangchuong.example04.entity.Token;
import com.thaihoangchuong.example04.service.TokenService;
import com.thaihoangchuong.example04.repository.TokenRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class TokenServiceImpl implements TokenService{
    private TokenRepository tokenRepository;

    @Override
    public Token createToken(Token token) {
        return tokenRepository.save(token);
    }

    @Override
    public Token getTokenById(Long tokenId) {
        Optional<Token> optionalToken = tokenRepository.findById(tokenId);
        return optionalToken.get();
    }

    @Override
    public List<Token> getAllTokens() {
        return tokenRepository.findAll();
    }

    @Override
    public Token updateToken(Token token) {
        Token existingToken = tokenRepository.findById(token.getId()).get();
        existingToken.setToken(token.getToken());
        existingToken.setUser(token.getUser());
   
        Token updatedToken = tokenRepository.save(existingToken);
        return updatedToken;
    }

    @Override

    public void deleteToken(Long tokenId) {
        tokenRepository.deleteById(tokenId);
    }
}
