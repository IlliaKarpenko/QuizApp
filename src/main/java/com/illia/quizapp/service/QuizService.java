package com.illia.quizapp.service;
import com.illia.quizapp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
     @Autowired
     QuizDao quizDao;


}
