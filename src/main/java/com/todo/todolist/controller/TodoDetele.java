package com.todo.todolist.controller;

import com.todo.todolist.model.TodoItem;
import com.todo.todolist.repository.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/delete")
public class TodoDetele {

    @DeleteMapping
    public List<TodoItem> delete(@RequestBody TodoItem todoItem){
        TodoRepository todoRepo = new TodoRepository();
        todoRepo.delete(todoItem);
        return todoRepo.getAll();
    }
}
