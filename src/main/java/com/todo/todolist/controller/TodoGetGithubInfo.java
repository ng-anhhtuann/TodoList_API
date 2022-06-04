package com.todo.todolist.controller;

import com.google.gson.JsonObject;
import com.todo.todolist.model.GitHubUserItem;
import com.todo.todolist.repository.TodoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/getgithub", params = {"userName"})

public class TodoGetGithubInfo {
    @GetMapping
    public Object getInfo(@RequestParam(value = "userName") String userName) {
        TodoRepository todoRepo = new TodoRepository();
        return todoRepo.getInfoHttpMapping(userName);
    }
}
