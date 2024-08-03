package com.question.QuestionService.controllers;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;
//    public QuestionService

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }
    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }
    @GetMapping("/{questionId}")
    public Question getOne(@PathVariable Long questionId){
        return questionService.getOne(questionId);
    }

}
