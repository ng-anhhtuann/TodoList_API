package com.todo.todolist.repository;

import com.todo.todolist.model.TodoItem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
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
    public List<TodoItem> getAll()  {
        Collections.sort(todoItemList);
        return todoItemList;
    }
    public String getInfoHttpMapping(String name){
        String responseInfo;
        try {
            URL url = new URL("https://api.github.com/users/" + name);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response);
                responseInfo = response.toString();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return responseInfo;
    }
}
