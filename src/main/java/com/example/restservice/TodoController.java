package com.example.restservice;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class TodoController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();


  @GetMapping("/todos")
  public ArrayList<Todo> todo() {
    ArrayList<Todo> todos = new ArrayList<Todo>();
    Todo testTodo = new Todo(1, "Get Todos", false);
    todos.add(testTodo);
    return todos;
  }

	@PostMapping("/todos")
	public Todo addTodo(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Todo(counter.incrementAndGet(), String.format(template, name), false);
	}

  @PutMapping("/todos/{id}")
  public Todo toggleTodoCompleted() {
    return new Todo(100, "Put Todos", false);
  }
  

}