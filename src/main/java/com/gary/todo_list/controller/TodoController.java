package com.gary.todo_list.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gary.todo_list.entity.Todo;
import com.gary.todo_list.repository.TodoRepository;

@Controller
public class TodoController {
	
	@Autowired
	TodoRepository todoRepository;
	
	@GetMapping({"/list", "/"})
	public ModelAndView showList() {
		ModelAndView mav = new ModelAndView("todo_list");
		List<Todo> todolist = todoRepository.findAll();
		mav.addObject("todolist",todolist);
		return mav;
	}
	
	@GetMapping("/addTodoForm")
	public ModelAndView addTodoForm() {
		ModelAndView mav = new ModelAndView("add_todo_form");
		Todo newTodo = new Todo();
		mav.addObject("newTodo", newTodo);
		return mav;
	}
	
	@PostMapping("/addTodo")
	public void addTodo(@ModelAttribute Todo todo, HttpServletResponse response) throws IOException {
		todoRepository.save(todo);
		response.sendRedirect("/list");
	}
	
}