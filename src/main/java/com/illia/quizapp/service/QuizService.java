package com.illia.quizapp.service;
import com.illia.quizapp.dao.QuestionDao;
import com.illia.quizapp.dao.QuizDao;
import com.illia.quizapp.model.Quiz;
import com.illia.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
     @Autowired
     QuizDao quizDao;
     @Autowired
     QuestionDao questionDao;

     public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
          List<Question> questions = questionDao.findRandomQuestiondsByCategory(category, numQ);

          Quiz quiz = new Quiz();
          quiz.setTitle(title);
          quiz.setCategory(category);
          quiz.setQuestions(questions);
          quizDao.save(quiz);

          return new ResponseEntity<>("Success", HttpStatus.CREATED);
     }
}
