package com.gary.todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gary.todo_list.entity.CompletedTodo;

public interface CompletedTodoRepository extends JpaRepository<CompletedTodo, Long> {

}
