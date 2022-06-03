package com.todo.todolist.controller;

import com.todo.todolist.model.TodoItem;
import com.todo.todolist.repository.TodoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class TodoPost {

    @PostMapping
    public List<TodoItem> post(@RequestBody TodoItem todoItem){
        TodoRepository todoRepo = TodoRepository.getInstance();
        todoRepo.add(todoItem);
        return todoRepo.getAll();
    }
}
