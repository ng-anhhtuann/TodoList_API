package com.todo.todolist.controller;

import com.todo.todolist.model.TodoItem;
import com.todo.todolist.repository.TodoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/get")
public class TodoGetList {

    @GetMapping
    public List<TodoItem> findAll(){
        TodoRepository todoRepo = TodoRepository.getInstance();
        return todoRepo.getAll();
    }
}
