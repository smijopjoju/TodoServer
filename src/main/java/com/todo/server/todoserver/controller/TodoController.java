package com.todo.server.todoserver.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.server.todoserver.repository.Todo;
import com.todo.server.todoserver.repository.TodoRepository;

@RestController
public class TodoController {

	@Autowired
	TodoRepository repository;
	
	@PostMapping("/todo/save")
	public Todo createTodo(@RequestBody Todo todoObj) {
		try {
				todoObj = repository.save(todoObj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todoObj;
	}
	
	@PostMapping("/todo/update")
	public Todo updateTodo(@RequestBody Todo todoObj) {
		try {
			todoObj = repository.save(todoObj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todoObj;
	}
	
	@PostMapping("/todo/delete")
	public boolean deleteTodo(@RequestBody Todo todoObj) {
		boolean success = true;
		try {
			repository.delete(todoObj);
		} catch (Exception e) {
			e.printStackTrace();
			success = false;
		}
		return success;
	}
	
	@GetMapping("/todo/getTodo")
	public Optional<Todo> getTodo(@RequestParam("id") int id) {
		try {
				return repository.findById(id);
		} catch( Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/todo/getAllTodo")
	public Iterable<Todo> getTodo() {
		try {
				return repository.findAll();
		} catch( Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
