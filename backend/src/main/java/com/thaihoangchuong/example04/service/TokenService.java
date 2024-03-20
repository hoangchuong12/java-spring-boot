package com.thaihoangchuong.example04.service;

import java.util.List;
import com.thaihoangchuong.example04.entity.Token;
public interface TokenService {
    Token createToken(Token token);

    Token getTokenById(Long tokenId);

    List<Token> getAllTokens();

    Token updateToken(Token role);

    void deleteToken(Long tokenId);
}
