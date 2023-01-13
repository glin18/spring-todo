package com.gary.todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gary.todo_list.entity.CompletedTodo;

@Repository
public interface CompletedTodoRepository extends JpaRepository<CompletedTodo, Long> {

}
