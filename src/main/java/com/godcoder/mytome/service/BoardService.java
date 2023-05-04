package com.godcoder.mytome.service;

import com.godcoder.mytome.model.Board;
import com.godcoder.mytome.model.User;
import com.godcoder.mytome.repository.BoardRepository;
import com.godcoder.mytome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;


    public Board save(String username, Board board){
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
