package webapp.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController 
{
	@Autowired
	private TodoService service;
	
	
	@RequestMapping(value= "/todos", method = RequestMethod.GET)
	public List<Todo> retrieveAllTodos()
	{
		List<Todo> users = service.retrieveTodos("Chris");
		return users;
	}
	@RequestMapping(value= "/todos/{id}", method = RequestMethod.GET)
	public Todo retrieveTodo(@PathVariable int id)
	{
		return service.retrieveTodo(id);
	}

}
