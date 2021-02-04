package com.to_do_list.springboot.web.main.service;

import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.to_do_list.springboot.web.main.model.Todo;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 5;
	
	static {
		todos.add(new Todo(1, "admin", "Learn Spring Boot", new Date(), true));
		todos.add(new Todo(2, "admin", "Learn Spring Cloud", new Date(), true));
		todos.add(new Todo(3, "admin", "Learn Spring Security", new Date(), false));
		todos.add(new Todo(4, "admin", "Learn Docker", new Date(), false));

	}
	
	
	/* pass in username and retrieve their todos
	 * @return ArrayList<Todo>
	 */
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if(todo.getUser().equals(user)) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
	
	/* pass in id and retrieve a single todo
	 * @return Todo
	 */
	public Todo getTodo(int id) {
		for (Todo todo : todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	/* add a todo
	 * 
	 */
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}
	
	/* delete a todo
	 * 
	 */
	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while(iterator.hasNext()) {
			Todo todo = iterator.next();
			if(todo.getId() == id){
				iterator.remove();
			}
		}
	}
	
	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}
}
