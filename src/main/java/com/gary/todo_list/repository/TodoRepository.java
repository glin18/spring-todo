package com.gary.todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gary.todo_list.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
	
}
