package com.todo.todolist.repository;

import com.todo.todolist.model.TodoItem;

import java.util.*;

public class TodoRepository {
    public TodoRepository(){}
    public static TodoRepository Instance;
    public static List<TodoItem> todoItemList;
    public static TodoRepository getInstance() {
        if (Instance == null) {
            Instance = new TodoRepository();
            todoItemList = new ArrayList<>();
        }
        return Instance;
    }

    public void setTodoRepositoryInstance(TodoRepository Instance) {
        TodoRepository.Instance = Instance;
    }

    //Add & get the lastest information while being the same in id
    public void add(TodoItem todoItem) {
        int listLength = todoItemList.size();
        if (listLength == 0 ){
            todoItemList.add(todoItem);
        } else {
            Long idInstant = todoItem.getId();
            for (int i = 0; i < listLength; i++) {
                Long indexId = todoItemList.get(i).getId();
                if (Objects.equals(indexId, idInstant)) {
                    todoItemList.remove(i);
                    break;
                }
            }
            todoItemList.add(todoItem);
        }
        Collections.sort(todoItemList);
    }
    //Delete by each object
    public void delete(TodoItem todoItem) {
        int listLength = todoItemList.size();
        for (int i = 0; i < listLength; i++) {
            if (Objects.equals(todoItemList.get(i).getId(), todoItem.getId())) {
                todoItemList.remove(i);
                break;
            }
        }
        Collections.sort(todoItemList);
    }
    //Get all the List
    public List<TodoItem> getAll() {
        Collections.sort(todoItemList);
        return todoItemList;
    }
}
