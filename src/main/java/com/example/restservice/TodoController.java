package com.example.restservice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping("/todos")
  public List<Todo> getTodos() {
    return todoRepository.findAll();
  }

	@PostMapping("/todos")
	public Todo addTodo(@RequestBody Map<String, String> body) {
    String task = body.get("task");
    System.out.println(new Todo(task));
		return todoRepository.save(new Todo(task));
	}

  @PutMapping("/todos/{id}")
  public Todo toggleTodoCompleted() {
    return new Todo(100, "Put Todos", false);
  }
  
}